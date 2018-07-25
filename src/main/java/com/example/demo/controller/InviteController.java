package com.example.demo.controller;

import com.example.demo.entity.Invite;
import com.example.demo.service.InviteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@RequestMapping("/invite")
@Controller
public class InviteController {
    @Autowired
    private InviteService inviteService;


    /**
     * 注册成功直接跳转招聘。jsp页面
     * 跳自己
     * @return
     */
    @RequestMapping(value = "/inviteOneself",method = RequestMethod.GET)
    public String invite(Model model){
        List<Invite> invites = inviteService.selectAllInvite();
        model.addAttribute("invites",invites);
        return "forward:/invite/lookAllinvite.jsp";
    }
}
