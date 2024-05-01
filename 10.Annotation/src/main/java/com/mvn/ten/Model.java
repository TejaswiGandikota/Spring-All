package com.mvn.ten;

public class Model {
     private int id;
     private String name;
     private String model;
     
     public void setId(int id)
     {
    	 this.id = id;
     }
     public int getId()
     {
    	 return id;
     }
     public void setName(String name)
     {
    	 this.name = name;
     }
     public String getName()
     {
    	 return name;
     }
     public void setModel(String model)
     {
    	 this.model = model;
     }
     public String getModel()
     {
    	 return model;
     }
     public Model()
     {
    	 super();
     }
     public Model(int id,String name,String model)
     {
    	 super();
    	 this.id = id;
    	 this.name = name;
    	 this.model = model;
     }
    public void start()
    {
   	 System.out.println("Car Started");
    }
}
