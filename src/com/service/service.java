package com.service;

import java.util.List;

public interface service {

	public int check(String usn,String psw);
	
	public int create(String usn,String psw);
	
	public int findId(String usn);
	
	public String searchRusn();
	
	public String searchRscore();
	
	public void addPoint(int point,int stuId);
}
