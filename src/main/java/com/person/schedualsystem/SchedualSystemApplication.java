package com.person.schedualsystem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceTransactionManagerAutoConfiguration;

@SpringBootApplication
public class SchedualSystemApplication {

    public static void main(String[] args) {
        SpringApplication.run(SchedualSystemApplication.class, args);
    }

}
