package com.in28minutes.learnspringframework;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

public class App02HelloWorldSpring { //the JVM
    public static void main(String[] args) {
        //1: Launch a Spring Context
        var context =
                new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);  //AnnotationConfigApplicationContext - the Spring context

        //2: Configure the things that we want Spring to manage -
        // HelloWorldConfiguration - @Configuration class
        //name method - @Bean

        //3: Retrieving Beans managed by Spring
        System.out.println(context.getBean("name"));
        System.out.println(context.getBean("age"));
        System.out.println(context.getBean("person"));
        System.out.println(context.getBean("address"));
        System.out.println(context.getBean("person2MethodCall"));
        System.out.println(context.getBean("person3Parameters"));
        //System.out.println(context.getBean(Address.class));

        Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
        //context.getBeanDefinitionNames();
    }
}
