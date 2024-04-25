package com.springcoreday1.springcore;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        
    ApplicationContext context	= new ClassPathXmlApplicationContext("spring.xml");
    	
//    	Vehicle bike= new Bike(); 
//        bike.drive();
        Vehicle obj  = (Vehicle) context.getBean("car1");
        obj.drive();
        //Modifying to Committ
    }
}

