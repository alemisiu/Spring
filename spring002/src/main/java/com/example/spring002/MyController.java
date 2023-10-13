package com.example.spring002;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    @GetMapping("/2")
    public String sayHello() {
        return "Hello world ";
    }

    @GetMapping("/1")
    public int liczba() {
        var liczba = 42;
        return liczba;
    }

    @GetMapping("/3")
    public List<String> list() {

        ArrayList<String> list = new ArrayList<String>();

        list.add("1,2,3,4,5");
        return list;
    }
}
