package com.project.learnspringframework.examples.h1;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;

public class XMLConfigurationContextLauncherApplication {
    public static void main(String[] args) {

        try(var context = new ClassPathXmlApplicationContext("xmlConfiguration.xml")) {
            Arrays.stream(context.getBeanDefinitionNames())
                    .forEach(System.out::println);

            System.out.println(context.getBean("name"));
            System.out.println(context.getBean("age"));
            System.out.println(context.getBean("game"));
            System.out.println(context.getBean("gameRunner"));
        }
    }
}
