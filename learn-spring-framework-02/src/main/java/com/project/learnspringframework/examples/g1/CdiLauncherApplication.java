package com.project.learnspringframework.examples.g1;

import jakarta.inject.Inject;
import jakarta.inject.Named;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.Arrays;

// @Component
@Named // @Named from jakarta.inject is also same as @Component
class BusinessService {
    DataService dataService;

    // @Autowired
    @Inject // @Inject from jakarta.inject is also same as @Autowired
    public void setDataService(DataService dataService) {
        System.out.println("Setter DataService");
        this.dataService = dataService;
    }

    public DataService getDataService() {
        return dataService;
    }
}

@Named
class DataService {

}

@Configuration
@ComponentScan // When you simply say ComponentScan without package path it will take the package where it mentioned as by default
public class CdiLauncherApplication {
    public static void main(String[] args) {

        try(var context = new AnnotationConfigApplicationContext(CdiLauncherApplication.class)){
            Arrays.stream(context.getBeanDefinitionNames())
                    .forEach(System.out::println);
        }
    }
}
