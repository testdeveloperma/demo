package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SecondController {

    @GetMapping("/say")
    public String say(){
        String name = "666";
        return name;
    }

    @GetMapping("/getAge")
    public String getAge(){
        return "今年18";
    }


}
