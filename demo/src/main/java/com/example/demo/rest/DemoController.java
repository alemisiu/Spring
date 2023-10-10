package com.example.demo.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.common.Coach;

@RestController
public class DemoController {
  // define a private field for dependency

  private Coach myCoach;

  private Coach anotherCoach;

  @Autowired
  public void setCoach(@Qualifier("aquatic") Coach theCoach) {
    // , @Qualifier("cricketCoach") Coach theAnotherCoach) {
    System.out.println("in constructor: " + getClass().getSimpleName());
    myCoach = theCoach;
    // anotherCoach = theAnotherCoach;
  }

  @GetMapping("/dailyworkout")
  public String getDailyWorkout() {
    return myCoach.getDailyWorkout();
  }

  // @GetMapping("/check")
  // public String check() {
  //   return "comparing beans: myCoach == anotherCoach," + (myCoach == anotherCoach);
  // }

}
