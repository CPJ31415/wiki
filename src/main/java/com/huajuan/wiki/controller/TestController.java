package com.huajuan.wiki.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    /*
     * GET, POST, PUT, DELETE
     */

    @GetMapping("/hello")
    //GetPosting 405
    public String hello() {
        return "hello world";
    }

    @PostMapping("/hello/post")
    public String helloPost(String name) {
        return "hello world! Post. " + name;
    }
}
