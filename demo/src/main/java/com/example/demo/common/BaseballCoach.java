package com.example.demo.common;

import org.springframework.stereotype.Component;

@Component
public class BaseballCoach implements Coach {

public BaseballCoach(){
    System.out.println("in constructor: " + getClass().getSimpleName());;
}

    @Override
    public String getDailyWorkout() {
        // TODO Auto-generated method stub
        return "Spend 30 minuted at batting practise";
    }   

}
