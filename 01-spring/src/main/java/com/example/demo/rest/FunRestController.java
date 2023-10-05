package com.example.demo.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {

    @Value("${coach.name}")
    private String coachName;

    @Value("${team.name}")
    private String teamName;

    // expose team info

    @GetMapping("/teaminfo")
    public String getTeamInfo() {
        return "coach " + coachName + ", Team name " + teamName;
    }

    @GetMapping("/")
    public String sayHello() {
        return "Hello world ";
    }

    @GetMapping("Workout")
    public String getDailyWorkout() {
        return "Run a hard 5k!";
    }

}
