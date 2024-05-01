package com.Student.Student1.Interface;

public class Student1Imp implements Student1Interface 
{
	private int rollno;
	private String name;
	private String course;
	private String batch;
	private String doj;
	private String location;
	
	public Student1Imp()
	{
		
	}
	public Student1Imp(int rollno, String name, String course, String batch, String doj, String location)
	{
		this.rollno = rollno;
		this.name = name;
		this.course = course;
		this.batch = batch;
		this.doj = doj;
		this.location = location;
	}

	@Override
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	@Override
	public void setName(String name) {
		this.name = name;

	}

	@Override
	public void setCourse(String course) {
		this.course = course;

	}

	@Override
	public void setBatch(String batch) {
		this.batch = batch;
	}

	@Override
	public void setDoj(String doj) {
		this.doj = doj;
	}

	@Override
	public void setLocation(String location) {
		this.location = location;

	}

	@Override
	public int getRollno() {
		return this.rollno;
	}

	@Override
	public String getName() {
		return this.name;
	}

	@Override
	public String getCourse() {
		return this.course;
	}

	@Override
	public String getBatch() {
		return this.batch;
	}

	@Override
	public String getDoj() {
		return this.doj;
	}

	@Override
	public String getLocation() {
		return this.location;
	}

}
