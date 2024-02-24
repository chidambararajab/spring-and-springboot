package com.project.learnspringframework.businesscalculationservice;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.Arrays;

interface DataService {
    int[] responseData();
}

//@Component
@Repository // @Repository is a specilization of @Component - We can use @Repository if we use t retrive data, its just a word change but similar to the @Component
@Primary
class MongoDB implements DataService {
    @Override
    public int[] responseData() {
        return new int[] {1,2,5,3,4};
    }
}

//@Component
@Repository // @Repository is a specilization of @Component - We can use @Repository if we use t retrive data, its just a word change but similar to the @Component
@Qualifier("mySqlQualifier")
class MySQLDB implements DataService {
    @Override
    public int[] responseData() {
        return new int[] {1,1,3,2,0};
    }
}

@Service // @Service is a specilization of @Component
public class BusinessCalcualtionServiceApplication {
    private DataService dataService;

    @Autowired
    public BusinessCalcualtionServiceApplication(DataService dataService) {
        this.dataService = dataService;
    }

    public int findMax() {
        return Arrays.stream(dataService.responseData()).max().orElse(0);
    }
}
