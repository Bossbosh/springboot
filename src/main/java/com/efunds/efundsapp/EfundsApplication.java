package com.efunds.efundsapp;


import com.zhy.log.config.CustomConfigurationFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class EfundsApplication extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(EfundsApplication.class);
    }

    public static void main(String[] args) {
        System.setProperty("log4j.configurationFactory", CustomConfigurationFactory.class.getName());
        SpringApplication springApplication = new SpringApplication(EfundsApplication.class);
        springApplication.run(args);
    }


}
