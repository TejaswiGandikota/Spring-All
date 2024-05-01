package com.spring.nine;

public class Second {
	private int id;
	private String name;
	private String course;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCourse()
	{
		return course;
	}
	public void setCourse(String course)
	{
		this.course = course;
	}
	public Second(int id, String name,String course) {
		super();
		this.id = id;
		this.name = name;
	}
	public Second() {
		super();
		// TODO Auto-generated constructor stub
	}

	
}
