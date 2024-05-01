package com.mvn.DependencyInjection1;

public class Details {
	private String education;
    private String location;
    public Details()
    {
  	  
    }
    public Details(String education, String location)
    {
  	  this.education = education;
  	  this.location = location;
    }
    public  void setEducation(String education)
    {
  	  this.education = education;
    }
    public void setLocation(String location)
    {
  	  this.location = location;
    }
    public String getEducation()
    {
  	  return this.education;
    }
    public String getLocation()
    {
  	  return this.location;
    }
}
