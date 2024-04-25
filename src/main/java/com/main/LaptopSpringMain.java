package com.main;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.service.Laptop;

public class LaptopSpringMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			
				ApplicationContext applicationContext=new ClassPathXmlApplicationContext("spring.xml");
				
				Laptop laptop=(Laptop)applicationContext.getBean("laptop01");
				laptop.setBrand("Dell");
				laptop.setColor("Matte Black");
				laptop.setPrice(400);
				/*laptop.setBrand("HP");
				laptop.setColor("Ash");
				laptop.setPrice(700);
				*/
				System.out.println(laptop);
				
				
				
				
				
				

			}

		}


