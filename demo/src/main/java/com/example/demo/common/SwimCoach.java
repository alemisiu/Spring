package com.example.demo.common;

// import org.springframework.stereotype.Component;

public class SwimCoach implements Coach {
// no componenet bcs we created one more class and bean annotation -@Component
    public SwimCoach() {
        System.out.println("in constructor:" + getClass().getSimpleName());

    }

    @Override
    public String getDailyWorkout() {

        // TODO Auto-generated method stub
        return ("swim 1000 meters as a warm up");
    }

}
