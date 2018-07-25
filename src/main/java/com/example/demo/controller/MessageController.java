package com.example.demo.controller;

import com.alibaba.fastjson.JSON;
import com.example.demo.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


@RequestMapping("/messages")
@Controller
public class MessageController{
    @Autowired
    private MessageService messageService;


    @RequestMapping(value = "/readme",method = RequestMethod.POST)
    @ResponseBody
    public String readMe(){
        int cout = messageService.selectById();
        System.out.println(cout);
        String data = JSON.toJSONString(cout);
        return data;
    }
}
