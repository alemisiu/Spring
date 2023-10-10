package com.example.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.demo.common.Coach;
import com.example.demo.common.SwimCoach;

@Configuration
public class SportConfig {
    //bean instead of using component annotation to the primary java file but need to create one more class
    @Bean("aquatic")
    public Coach swimCoach()
    {
        return new SwimCoach();
    }
}
