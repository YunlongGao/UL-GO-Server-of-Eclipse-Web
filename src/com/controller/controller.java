package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSONObject;
import com.service.service;

@Controller
@RequestMapping("testClass")
public class controller {

	@Autowired
	@Qualifier("serviceImpl")
	service serv;
	
	@ResponseBody
	@RequestMapping("testParams")
	public String testParams(String usn,String psw) throws Exception{
	
	    System.out.println("username===" + usn);
	    System.out.println("password===" + psw);
	    
	    int check = serv.check(usn, psw);
	    JSONObject json = new JSONObject();
	    json.put("check", check);
	    System.out.println(check);
	    return json.toJSONString();      	    
	}
	
	@ResponseBody
	@RequestMapping("create")
	public String create(String usn,String psw){
		System.out.println(usn);
		System.out.println(psw);
		int createbk = serv.create(usn, psw);
		JSONObject json = new JSONObject();
		json.put("check", createbk);
		return json.toJSONString();
	}

	@ResponseBody
	@RequestMapping("rankScore")
	public String rankScore(){	
		System.out.println("flag1");
		String res = serv.searchRscore()+"@"+serv.searchRusn();	
		System.out.println("flag2");
		return res;
	}
	
	@ResponseBody
	@RequestMapping("addPoint")
	public String addPoint(int stuId,int point){
		serv.addPoint(point, stuId);
		System.out.println("flag");
		return "success";
	}
	
}