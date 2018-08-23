package com.pojo;

public class Point {

	private int point;
	private int stuId;
	public int getPoint() {
		return point;
	}
	public void setPoint(int point) {
		this.point = point;
	}
	public int getStuId() {
		return stuId;
	}
	public void setStuId(int stuId) {
		this.stuId = stuId;
	}
	public Point(int point, int stuId) {
		super();
		this.point = point;
		this.stuId = stuId;
	}
	public Point() {
		super();
	}
	@Override
	public String toString() {
		return "Point [point=" + point + ", stuId=" + stuId + "]";
	}
	
	
}
