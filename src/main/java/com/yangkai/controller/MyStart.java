package com.yangkai.controller;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

/**
 * Created by yangkai on 2017-09-14.
 */
@SpringBootApplication(scanBasePackages = {"com.yangkai"}, exclude = {})
@ServletComponentScan(basePackages = {"com.yangkai"})
@MapperScan("com.yangkai.dao")
public class MyStart {
    public static void main(String[] args) {
        SpringApplication.run(MyStart.class, args);
    }

}
