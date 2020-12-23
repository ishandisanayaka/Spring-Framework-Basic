package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App
{
    public static void main( String[] args )
    {
        //Vehicle obj=new Car();
//Beanfactory and ApplicationContext both can be use to implement the getBean().
//ApplicationContext is superclass of the Beanfactory which use to small project
        ApplicationContext context=new ClassPathXmlApplicationContext("Bean.xml");

//        Vehicle obj= (Vehicle) context.getBean("vehicle");

//        Vehicle obj= (Vehicle) context.getBean("bike");
//
//        obj.drive();
        //Tyre t=new Tyre();


//        Tyre t= (Tyre) context.getBean("tyre");
//        System.out.println(t);


        Car obj= (Car) context.getBean("car");
        obj.drive();

    }
}
