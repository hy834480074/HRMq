package com.example.demo.service;

import com.example.demo.entity.Staff;

public interface StaffService {

    /**
     * 注册新用户
     * @param name
     * @param password
     */
    boolean register(Staff staff);


    /**
     * 登录
     * @param staff
     * @return
     */
    Staff checkAccount(Staff staff);


    /**
     * 修改密码
     * @param staff
     * @return
     */
    int updataStaff(Staff staff);


}
