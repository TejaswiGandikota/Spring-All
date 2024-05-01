package com.mvn.Product.Product;

public class App 
{
    public static void main( String[] args )
    {
		/*
		 * ProductConstructor pc = new ProductConstructor(101,"Lipstick","Lakme",850.5);
		 * pc.print();
		 */
		/*
		 * ProductClassMethods pcm = new ProductClassMethods(); pcm.insert(101,
		 * "Lipstick", "Lakme", 850.99); pcm.print();
		 */
    	ProductSetter p = new ProductSetter();
    	p.setId(101);
    	p.setName("Lipstick");
    	p.setBrand("Lakme");
    	p.setPrice(999.00);
    	System.out.println(p.getId());
    	System.out.println(p.getName());
    	System.out.println(p.getBrand());
    	System.out.println(p.getPrice());
   }
}
