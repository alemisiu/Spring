package com.example.demo.common;

// import org.springframework.beans.factory.config.ConfigurableBeanFactory;
// import org.springframework.context.annotation.Scope;
// import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

// import jakarta.annotation.PostConstruct;
// import jakarta.annotation.PreDestroy;

// @Primary 
@Component
// @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class CricketCoach implements Coach {

    public CricketCoach() {
        System.out.println("in constructor: " + getClass().getSimpleName());
    }

    // @PostConstruct
    // public void doMyStartupStuff() {
    //     System.out.println("in do my startupstuff():" + getClass().getSimpleName());
    // }

    //  @PreDestroy
    // public void doMyCleanupStuff() {
    //     System.out.println("in do my cleanup():" + getClass().getSimpleName());
    // }

    @Override
    public String getDailyWorkout() {
        // TODO Auto-generated method stub
        return "Train bowling straight for 15 minutes";
    }

}
