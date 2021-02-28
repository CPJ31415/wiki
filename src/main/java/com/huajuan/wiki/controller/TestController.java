package com.huajuan.wiki.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
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
}
