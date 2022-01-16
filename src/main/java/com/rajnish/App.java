package com.rajnish;

import javax.annotation.PostConstruct;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    
     
     
     ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
     Card bean2 = context.getBean("card",Card.class);
     
     User bean = context.getBean("user",User.class);
     System.out.println(bean);
    
     System.out.println(bean2);
     }
    

}
