package com.project.learnspringframework.examples.e0;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.*;
import org.springframework.stereotype.Component;

import java.util.Arrays;



@Component
class NormalClass { }

@Component
@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE) // Create a new instance
class PrototypeClass {

}

@Configuration
@ComponentScan // When you simply say ComponentScan without package path it will take the package where it mentioned as by default
public class BeanScopeLauncherApplication {
    public static void main(String[] args) {

        try(var context = new AnnotationConfigApplicationContext(BeanScopeLauncherApplication.class)){

            // Default SCOPE_SINGLETON Use the same instace
            System.out.println(context.getBean(NormalClass.class));
            System.out.println(context.getBean(NormalClass.class));
            System.out.println(context.getBean(NormalClass.class));
            System.out.println(context.getBean(NormalClass.class));

            // SCOPE_PROTOTYPE Create a new instance
            System.out.println(context.getBean(PrototypeClass.class));
            System.out.println(context.getBean(PrototypeClass.class));
            System.out.println(context.getBean(PrototypeClass.class));
            System.out.println(context.getBean(PrototypeClass.class));
        }
    }
}
