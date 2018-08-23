package com.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSONObject;
import com.mapper.mapper;
import com.pojo.Point;
import com.pojo.login;
import com.service.service;

import net.sf.json.JSONArray;

@Service("serviceImpl")
public class serviceImpl implements service{
	
	@Autowired
	mapper mapp;
	
	@Override
	public int check(String usn, String psw) {
		String cpsw = mapp.queryPsw(usn);
		if (psw.equals(cpsw)) {
			return findId(usn);
		}else{
			return 0;	
		}
	}

	@Override
	public int create(String usn, String psw) {
		login lo = new login(usn, psw);
		return mapp.create(lo);
	}

	@Override
	public int findId(String usn) {
		return mapp.findId(usn);
	}

	@Override
	public String searchRscore() {
		List list = new ArrayList<String>();
		list = mapp.searchRscore();
		JSONArray jsonArr = JSONArray.fromObject(list);
		return jsonArr.toString();
	}

	@Override
	public String searchRusn() {
		List list = new ArrayList<String>();
		list = mapp.searchRusn();
		JSONArray json = JSONArray.fromObject(list);
		return json.toString();
	}

	@Override
	public void addPoint(int point, int stuId) {
		Point po = new Point(point, stuId);
		mapp.addPoint(po);
	}


}
