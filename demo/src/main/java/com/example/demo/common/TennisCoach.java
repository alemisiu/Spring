package com.example.demo.common;

import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {

    public TennisCoach(){
        System.out.println("in constructor: " + getClass().getSimpleName());;
    }

    @Override
    public String getDailyWorkout() {
        // TODO Auto-generated method stub
        return "Practise your backand valley";
    }

}
