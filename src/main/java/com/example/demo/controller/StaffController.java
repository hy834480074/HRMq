package com.example.demo.controller;

import com.example.demo.entity.Staff;
import com.example.demo.service.StaffService;
import com.example.demo.utils.ObjUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@RequestMapping("/staff")
@Controller
public class StaffController {
    @Autowired
    private StaffService staffService;

    @RequestMapping(value = "/regAndLog", method = RequestMethod.POST)
    @ResponseBody
    public String regAndLog(Staff staff,String choose){
        if(choose.equals("菜鸟")) {
            return staffEquals(staff,"Reg");
        }
       if(choose.equals("踏入江湖")){
            return staffOffer(staff);
       }
       return "";
    }

    @RequestMapping(value = "/staffOneself", method = RequestMethod.POST)
    public String staffOneself(){
        return "forward:/look/login.jsp";
    }

    /**
     * 判断是否用户存在
     * 密码是否正确
     * @param staff
     * @return
     */
    public String staffEquals(Staff staff,String x) {
        if(staffService.register(staff)){
            return "register"+x;
        }else {
            return "repetition"+x;
        }
    }
    /**
     * 登录
     * @param staff
     * @return
     */
    public String staffOffer(Staff staff){
        Staff staff1 = staffService.checkAccount(staff);
        ObjUtil.setStaff(staff1);
        if(staff1!=null){
            return staffOffer2(staff1);
        }
        return "repetitionLog";
    }
    public String staffOffer2(Staff staff){
        if(staff.getStaffOffer().equals("临时")){
            return "temporaryLog";
        }
        return "workinterfaceLog";
    }








}
