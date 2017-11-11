package com.example.akabane;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

@RestController
public class AkabaneController {

    @RequestMapping("/")
    public String start(HttpSession session) {
        return "Hello Akabane";
    }
    @RequestMapping("/hongsik")
    public String start2(HttpSession session) {
        return "Hello Hongsik";
    }

}