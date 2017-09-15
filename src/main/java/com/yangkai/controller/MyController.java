package com.yangkai.controller;

import com.yangkai.model.InputUserModel;
import com.yangkai.service.InputUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * Created by yangkai on 2017-09-14.
 */
@Controller
public class MyController {

    @Resource
    private InputUserService inputUserService;

    @RequestMapping("test1")
    @ResponseBody
    public String test1(String id){
        InputUserModel userModel = inputUserService.selectById(Integer.parseInt(id));
        return userModel.getIuPassword();
    }
}
