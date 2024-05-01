package com.mvn.DependencyInjection1;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Details d = new Details("B.Sc","Andhra Pradesh");
        Employee e = new Employee("Tejaswi",45000.0,d);
        Company c = new Company("Wipro",e);
        c.print();
    }
}
