package com.example.demo.controller;

import com.example.demo.entity.Staff;
import com.example.demo.utils.ObjUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpSession;

@RequestMapping("/common")
@Controller
public class CommonController {
    @Autowired
    private CompensationConntroller compenstationConntroller;
    @Autowired
    private DepartmentController departmentController;

    @RequestMapping(value = "/examine",method = RequestMethod.GET)
    public String commonExamine(HttpSession session) {
        int statu = statu();
        all(session);
        return "/common/commonAll1.0";
    }
    /**
     * 判断身份
     * @return
     */
    public int statu() {
        Staff staff = ObjUtil.getStaff();
        if(staff.getStaffOffer().equals("员工")){
            return 1;
        }else if (staff.getStaffOffer().equals("部门经理")){
            return 2;
        }else if (staff.getStaffOffer().equals("经理")){
            return 3;
        }else {
            return 0;//管理员
        }
    }

//    查自己工资
    public String compensation1(){
        return "forward:/compensation/compersationLookOne";
    }
//    查部门
    public String department1(){
        return "department/departmentLookOne";
    }

//    查消息
    public String message1(){
        return "message/messageLookOne";
    }
//    查培训
    public String train1(){
        return "trains/trainsLookOne";
    }
//    查奖惩
    public String rewardandpunishment1(){
        return "rewardandpunishment/rewardandpunishmentLookOne";
    }
//    查离职
    public String overtime1(){
        return "overtime1/overtime1LookOne";
    }

    /**
     * 全部存到session中
     * @param session
     */

    public void all(HttpSession session){
        compenstationConntroller.compersationOneself(session);
        departmentController.departmentAll(session);
    }


    @RequestMapping(value = "/common2")
    public String commonAll2(){
        return "/common/commonAll2.0";
    }
}

