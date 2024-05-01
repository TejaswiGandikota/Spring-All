package com.mvn.Student.Student;

public class App 
{
    public static void main( String[] args )
    {
		/*
		 * StudentConstructor sc = new
		 * StudentConstructor(101,"Tejaswi","Java","01-11-2023","Batch-11"); sc.print();
		 */
		/*
		 * StudentClassMethods scm = new StudentClassMethods(); scm.insert(101,
		 * "Tejaswi", "Java", "01-11-2023", "Batch-11"); scm.print();
		 */
    	StudentSetter sc = new StudentSetter();
    	sc.setId(101);
    	sc.setName("Tejaswi");
    	sc.setCourse("Java");
    	sc.setDoj("01-11-2023");
    	sc.setBatch("Batch-11");
    	System.out.println(sc.getId());
    	System.out.println(sc.getName());
    	System.out.println(sc.getCourse());
    	System.out.println(sc.getDoj());
    	System.out.println(sc.getBatch());
    }
}
