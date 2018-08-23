package com.pojo;

public class login {
	private String usn;
	private String psw;
	private String stuId;
	
	
	
	public login(String usn, String psw) {
		super();
		this.usn = usn;
		this.psw = psw;
	}
	public String getUsn() {
		return usn;
	}
	public void setUsn(String usn) {
		this.usn = usn;
	}
	public String getPsw() {
		return psw;
	}
	public void setPsw(String psw) {
		this.psw = psw;
	}

	public login() {
		super();
	}
	public login(String usn, String psw, String stuId) {
		super();
		this.usn = usn;
		this.psw = psw;
		this.stuId = stuId;
	}
	public String getStuId() {
		return stuId;
	}
	public void setStuId(String stuId) {
		this.stuId = stuId;
	}

	
	
	
}
