package com.charan.demo.helloWorld;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

record Person(String name, int age, Address address){};

record Address(String firstLine, String city){};

@Configuration
public class HelloWorldConfiguration {

    @Bean
    public String name()
    {
        return "Charan";
    }

    @Bean
    public int age()
    {
        return 22;
    }

    @Bean
    public Person person()
    {
//        var person = new Person("Narasimha",24);
//        return person;
        return new Person("Narasimha",24, new Address("Kharadi","Pune"));
    }

    @Bean
    public Person person2Methodcall()
    {
        return new Person(name(),age(),address());
    }

    @Bean
    public Person person3Parameters(String name, int age, Address addr1)
    {
        return new Person(name, age, addr1);
    }

    @Bean
    public Person person5Qualifier(String name, int age, @Qualifier("addr3qualifier")  Address addr3)
    {
        return new Person(name, age, addr3);
    }


    @Bean("addr1")
    public Address address()
    {
        return new Address("Kharadi","Pune");
    }

    @Bean("addr2")
    public Address address2()
    {
        return new Address("Sirvel", "Nandyal");
    }

    @Bean("addr3")
    @Qualifier("addr3qualifier")
    public Address address3()
    {
        return new Address("Kurnool", "Nandyal");
    }

}