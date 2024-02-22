package com.project.learnspringframework.lazyapplication.a0;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import java.util.Arrays;


@Component
class ClassA { }

@Component
@Lazy
class ClassB {
    ClassA classA;

    ClassB(ClassA classA){
        System.out.println("Initilizing ClassB Component");
        // Logics for classA
        this.classA = classA;
    }

    public void doSomething() {
        System.out.println("Do Something");
    }
}


@Configuration
@ComponentScan // When you simply say ComponentScan without package path it will take the package where it mentioned as by default
public class LazyLauncherApplication {
    public static void main(String[] args) {

        try(var context = new AnnotationConfigApplicationContext(LazyLauncherApplication.class)){
            System.out.println("Initilization of context is done");
            context.getBean(ClassB.class).doSomething();
        }
    }
}
