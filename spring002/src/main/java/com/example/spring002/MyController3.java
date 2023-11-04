package com.example.spring002;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
// import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController3 {

    @GetMapping("/{tekst}/{liczba}/{tekst1}/{liczba1}")
    public String adressService(@PathVariable String tekst, @PathVariable int liczba, @PathVariable String tekst1,
            @PathVariable int liczba1) {

        return tekst + " pierwszy tekst" + liczba + " pierwsza liczba" + tekst1 + " drugi tekst" + liczba1
                + " druga liczba";

    }

}
