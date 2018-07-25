package com.example.demo.controller;

import com.example.demo.entity.Leaveoffice;
import com.example.demo.service.LeaveofficeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@RequestMapping("/leaveOff")
@Controller
public class LeaveOffController {
    @Autowired
    private LeaveofficeService leaveofficeService;


    @RequestMapping(value = "/leaveOffice")
    public String leaveOffice(){

        return "/leave/leaveOffice";
    }

    @RequestMapping(value = "/leaveOneself", method = RequestMethod.GET)
    public String leaveOneself(Leaveoffice leaveoffice){
        leaveofficeService.addLeaveOffice(leaveoffice);
        return "forward:/look/login.jsp";
    }
}
