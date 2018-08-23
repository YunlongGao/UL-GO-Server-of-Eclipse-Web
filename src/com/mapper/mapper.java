package com.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.pojo.Point;
import com.pojo.login;

public interface mapper {
	
	public String queryPsw(String usn);
	
	public int create(login lo);
	
	public int findId(String usn);
	
	public List<String> searchRusn();
	
	public List<String> searchRscore();
	
	public void addPoint(Point po);
}
