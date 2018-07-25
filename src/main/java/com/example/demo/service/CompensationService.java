package com.example.demo.service;

import com.example.demo.entity.Compensation;
import com.example.demo.entity.Staff;

import java.util.List;

public interface CompensationService {


    /**
     * 查看通过个人id和时间查看自己的工资
     * @return
     */
    List<Compensation> checkAccountByCompensation(Staff staff);


    /**
     * 申请改工资
     * @param compensation
     * @return
     */
    int updateAccountByCompensationDao(Compensation compensation);



    /**
     * 查看全部工资
     * @return
     */
    List<Compensation> lookAllCompensation();
}
