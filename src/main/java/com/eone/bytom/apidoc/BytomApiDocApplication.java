package com.eone.bytom.apidoc;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.AsyncConfigurer;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;


@SpringBootApplication
@EnableScheduling
@EnableAsync
public class BytomApiDocApplication implements AsyncConfigurer {


    public static void main(String[] args) {
        SpringApplication.run(BytomApiDocApplication.class, args);
    }

}
