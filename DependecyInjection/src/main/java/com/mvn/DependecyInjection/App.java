package com.mvn.DependecyInjection;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		/* Through Constructor
		 * Product p = new Product(1,"Oppo A15",50000.00);
		 * 
		 * Order o = new Order(1,"Mobile",p);
		 * 
		 * o.print();
		 */
		/* Through Setters And Getters
		 * Product p = new Product(); 
		 * Order o = new Order();
		 * 
		 * p.setProductid(101); 
		 * p.setProductname("Oppo A15");
		 *  p.setPrice(50000.0);
		 * 
		 * o.setOrderid(1); 
		 * o.setOrdername("Mobile"); 
		 * o.setProduct(p); 
		 * o.print();
		 */
		 
		// Through Constructor
		/*
		 * Marks m = new Marks(90,87,95); 
		 * Student s = new Student("Tejaswi",10,m);
		 * School sc = new School("Sri Chaitanya School",s); 
		 * sc.print();
		 */ 
		// Through Setter And Getters
		Marks m = new Marks();
		m.setMaths(90);
		m.setPhysics(85);
		m.setChemistry(95);
		
		Student s = new Student();
		s.setSname("Tejaswi");
		s.setSclass(10);
		s.setMarks(m);
		
		School sc = new School();
		sc.setSchoolname("Sri Chaitanya School");
	    sc.setStudent(s);
	    sc.print();
		
	}
}
