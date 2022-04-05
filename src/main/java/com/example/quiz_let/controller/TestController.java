package com.example.quiz_let.controller;

import com.example.quiz_let.entity.Answer;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/test")
public class TestController {
    @GetMapping("/hello")
    public String sayHello(){
        return "test/hello";
    }
    @GetMapping("/goodbye")
    public String sayGoodBye(){
        return "test/goodbye";
    }

}
