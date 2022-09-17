package com.bharath.first;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */


/**
 * @author BHARATH.Theivaraj
 *
 */
/**
 * @author BHARATH.T
 *
 */
public class App 
{
	
    public static void main( String[] args )
    {
    	
    	try {
    	
    	ApplicationContext conp = new ClassPathXmlApplicationContext("spring.xml");
    	
    	CompanyEmployee emp = (CompanyEmployee) conp.getBean("comemployee");
        emp.Employee();
       
    	}catch (Exception e) {
    		System.out.println(e);
    		
    	}
    }
	
}
