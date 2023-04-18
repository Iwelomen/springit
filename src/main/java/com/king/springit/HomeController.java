package com.king.springit;

import org.springframework.web.bind.annotation.GetMapping;

public class HomeController {

    @GetMapping("/")
    public  String home() {
        return  "Hello world!";
    }
}
