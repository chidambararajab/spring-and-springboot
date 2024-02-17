package com.project.learnspringframework.helloworld;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;


record Person(String name, int age, Address address) {};
record Address(String fiextLine, String secondLine) {};

@Configurable
public class HelloWorldConfiguration {

    @Bean
    public String name() {
        return "Chid";
    }

    @Bean
    public int age() {
        return 27;
    }

    @Bean
    public Person person1() {
        return new Person("Chidambararaja", 26, new Address("First Line Full Address Details", "Second Line Full Address Details"));
    }

    @Bean
    public Person person2() {
        return new Person(name(), 19, new Address("1st New Address Line Full Address Details", "2nd New Address Line Full Address Details"));
    }

    @Bean
    public Person personMethodCall() {
        return new Person(name(), 19, address());
    }

    @Bean
    public Person personParameterCall(String name, int age, Address address) {
        return new Person(name, 20, address);
    }

    @Bean(name = "address1")
    public Address address() {
        return  new Address("1st Line Full Address Details", "2nd Line Full Address Details");
    }

}
