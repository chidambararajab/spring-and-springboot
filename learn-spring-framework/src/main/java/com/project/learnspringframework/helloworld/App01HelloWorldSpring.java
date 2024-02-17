package com.project.learnspringframework.helloworld;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App01HelloWorldSpring {
    public static void main(String[] args) {
        var data = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);
        System.out.println(data.getBean("name"));
        System.out.println(data.getBean("age"));
        System.out.println(data.getBean("person1"));
        System.out.println(data.getBean("person2"));
        System.out.println(data.getBean("personMethodCall"));
        System.out.println(data.getBean("personParameterCall"));
        System.out.println(data.getBean("address1"));
    }
}
