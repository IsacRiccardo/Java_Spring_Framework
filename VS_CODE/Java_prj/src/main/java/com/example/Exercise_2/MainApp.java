package com.example.Exercise_2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String[] args) 
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("Beans_ex_2.xml");

        // Fetch beans from Beans_ex_2.xml
        Vehicle autoVehicle1 = (Vehicle) context.getBean("autoVehicle1");
        Vehicle autoVehicle2 = (Vehicle) context.getBean("autoVehicle2");
        Vehicle truck = (Vehicle) context.getBean("truck");

        // Fetch annotated bean for Motorcycle
        Vehicle motorcycle1 = (Vehicle) context.getBean("motorcycle");
        Vehicle motorcycle2 = (Vehicle) context.getBean("motorcycle");

        // Display all vehicles
        System.out.println("AutoVehicle 1: " + autoVehicle1);
        System.out.println("AutoVehicle 2: " + autoVehicle2);
        System.out.println("Truck: " + truck);
        System.out.println("Motorcycle 1: " + motorcycle1);
        System.out.println("Motorcycle 2: " + motorcycle2);
    }
}
