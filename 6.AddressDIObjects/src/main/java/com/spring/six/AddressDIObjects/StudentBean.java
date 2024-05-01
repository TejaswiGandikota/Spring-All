package com.spring.six.AddressDIObjects;

public class StudentBean {
           private int studentid;
           private String studentname;
           private AddressBean address;
           public StudentBean()
           {
        	   
           }
           public StudentBean(int studentid, String studentname, AddressBean address)
           {
        	   this.studentid = studentid;
        	   this.studentname = studentname;
        	   this.address = address;
           }
           public void setStudentid(int studentid)
           {
        	   this.studentid = studentid;
           }
           public void setStudentname(String studentname)
           {
        	   this.studentname = studentname;
           }
           public void setAddress(AddressBean address)
           {
        	   this.address = address;
           }
           public int getStudentid()
           {
        	   return this.studentid;
           }
           public String getStudentname()
           {
        	   return this.studentname;
           }
           public AddressBean getAddress()
           {
        	   return this.address;
           }
           public void print()
           {
        	   System.out.println("\nStudent Details are:");
        	   System.out.println("Studnet Id:" + studentid);
        	   System.out.println("Student Namae:" + studentname);
        	   System.out.println("\nStudent Address is:");
        	   System.out.println("HouseNum:" + address.getHousenum());
        	   System.out.println("City:" + address.getCity());
        	   System.out.println("State:" + address.getState());
        	   System.out.println("Pincode:" + address.getPincode());
        	   
           }
}
