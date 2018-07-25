package com.example.demo.controller;

import com.example.demo.entity.Compensation;
import com.example.demo.entity.Staff;
import com.example.demo.service.CompensationService;
import com.example.demo.utils.ObjUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
import java.util.List;

@RequestMapping("/compensation")
@Controller
public class CompensationConntroller {
    @Autowired
    private CompensationService compensationService;


    /**
     * 查询自己工资
     * @return
     */
    public void compersationOneself(HttpSession session){
        Staff staff = ObjUtil.getStaff();
        List<Compensation> compensations = compensationService.checkAccountByCompensation(staff);
        session.setAttribute("compensations",compensations);
    }

    /**
     * 管理员查看所有工资
     */
    public void compersationAll0(HttpSession session){

    }


}
