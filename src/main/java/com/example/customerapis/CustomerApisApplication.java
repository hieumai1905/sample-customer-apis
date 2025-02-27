package com.example.customerapis;

import org.springdoc.core.SpringDocConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@Import(SpringDocConfiguration.class)
public class CustomerApisApplication {

    public static void main(String[] args) {
        SpringApplication.run(CustomerApisApplication.class, args);
    }

}
