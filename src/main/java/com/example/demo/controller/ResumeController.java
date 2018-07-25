package com.example.demo.controller;

import com.example.demo.entity.Resume;
import com.example.demo.entity.Staff;
import com.example.demo.service.ResumeService;
import com.example.demo.utils.ObjUtil;
import com.sun.org.apache.xpath.internal.operations.Mod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpSession;
import java.util.List;

@RequestMapping("/resume")
@Controller
public class ResumeController {
    @Autowired
    private ResumeService resumeService;

    /**
     * 点击招聘按钮进去这个填写简历的.jsp
     * @return
     */
    @RequestMapping(value = "/resumeOneself",method = RequestMethod.GET)
    public String resumeOneself(HttpSession session){
        Resume resume = resumeService.lookMeResume();

        if(resume!=null){
            System.err.println("1111111111111111111111"+resume);
            session.setAttribute("resume",resume);
            return "/resumeWebInf/resumeXiuGai";
        }
        return "/resumeWebInf/resumeAdd";
    }

    /**
     * 填写简历增加一条新的简历
     * 返回查看界面
     * @param resume
     * @param model
     * @return
     */
    @RequestMapping(value = "/resumeAddResume")
    public String resumeAddResume(Resume resume,Model model){
        resumeService.registerResume(resume);
        return "forward:/invite/inviteOneself";
    }

    /**
     * 修改简历
     * @param resume
     * @param model
     * @return
     */
    @RequestMapping(value = "/resumeXiuGaiResume")
    public String resumeXiuGaiResume(Resume resume,Model model){
        resumeService.registerXiuGaiResume(resume);
        return "forward:/invite/inviteOneself";
    }
}
