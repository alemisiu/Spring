package com.example.demo.common;

// import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
//i am tados dont call me 
// @Lazy
public class TrackCoach implements Coach{

    public TrackCoach(){
        System.out.println("in constructor: " + getClass().getSimpleName());;
    }

    @Override
    public String getDailyWorkout() {
        // TODO Auto-generated method stub
        return"RUn a hard 5k!!";
    }
    
}
