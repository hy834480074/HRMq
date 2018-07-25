package com.example.demo.dao;

import com.example.demo.entity.Staff;
import org.apache.ibatis.annotations.Param;

public interface StaffDao {

    /**
     * 注册用户
     * @return
     */
    int registerStaffDao(Staff staff);

    /**
     * 根据账户或者密码判断
     * 登录
     * 返回对象
     * @param
     * @return
     */
    Staff checkAccount(Staff staff);

    /**
     * 通过名字返回对象
     * @param staff
     * @return
     */
    Staff checkAccountByAccountDao(Staff staff);

    /**
     * 根据id返回一个对象
     */
    Staff checkAccountById(int id);

    /**
     * 修改密码
     * @param staff
     * @return
     */
    int updataStaffDao(Staff staff);


    /**
     * 该状态根据id
     * @param staff
     * @return
     */
    int updataStaffDaoByOffer(Staff staff);

}
