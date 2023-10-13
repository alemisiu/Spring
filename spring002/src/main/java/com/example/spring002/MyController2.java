package com.example.spring002;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController2 {

    @GetMapping(path = "address")
    String returnString(@RequestParam(required = false) String imie, @RequestParam(required = false) String nazwisko,
            @RequestParam(required = false) String email, @RequestParam(required = false) String phoneNumber) {
        if (imie == null) {
            return " nie znamy twojego imienia";
        }
        if (nazwisko == null) {
            return " nie znamy twojego nazwiska";
        }
        if (email == null) {
            return " nie znamy twojego emaila";
        }
        if (phoneNumber == null) {
            return " nie znamy twojego nr telefonu ";
        }

        return "imie :" + imie + ", nazwisko" + nazwisko + ", email" + email + ",phoneNumber" + phoneNumber;
    }
}
