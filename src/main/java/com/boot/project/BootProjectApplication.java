package com.boot.project;


import com.zhy.log.config.CustomConfigurationFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BootProjectApplication {

    public static void main(String[] args) {
        System.setProperty("log4j.configurationFactory", CustomConfigurationFactory.class.getName());
        SpringApplication springApplication = new SpringApplication(BootProjectApplication.class);
        springApplication.run(args);
    }


}
