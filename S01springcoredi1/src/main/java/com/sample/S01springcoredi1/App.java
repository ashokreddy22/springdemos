package com.sample.S01springcoredi1;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	 ClassPathXmlApplicationContext springContainer = new ClassPathXmlApplicationContext("com/sample/S01springcoredi1/SpringConfig.xml");
         
        // Employee emp = (Employee) springContainer.getBean("emp"); 
        // System.out.println(emp);
         Employee em1=new Employee();
         em1.setId(10);
         em1.setName("reddy");
         //System.out.println(em1);
         course c= (course) springContainer.getBean("college");
         System.out.println(c);
         CarDelear cars=(CarDelear) springContainer.getBean("cars");
         System.out.println(cars);
         Products p=(Products)springContainer.getBean("products");
         System.out.println(p);
         ShoppingCart shopingcarts= (ShoppingCart) springContainer.getBean("carts");
         System.out.println(shopingcarts);
    }
}
