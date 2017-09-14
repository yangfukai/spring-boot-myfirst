package com.yangkai.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by yangkai on 2017-09-14.
 */
@RestController
public class MyController {

    @RequestMapping("test1")
    public String test1(String data){
        return data;
    }
}
