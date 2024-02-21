package com.project.learnspringframework.businesscalculationservice;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

@Configuration
@ComponentScan("com.project.learnspringframework.businesscalculationservice") // Or Leave ComponentScan empty to pick current package
public class RealWorldSpringCalculationContextApplication {

    public static void main(String[] args) {
        try(var context = new AnnotationConfigApplicationContext(RealWorldSpringCalculationContextApplication.class)) {
            System.out.println(context.getBean(BusinessCalcualtionServiceApplication.class).findMax());
        }
    }
}
