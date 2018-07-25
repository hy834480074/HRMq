package com.example.demo.dao;

import com.example.demo.entity.Compensation;

import java.util.List;


public interface CompensationDao {

    /**
     * 查看通过个人id查看自己的工资
     * @return
     */
    List<Compensation> checkAccountByCompensationDao(Compensation compensation);

    /**
     * 申请改工资
     * @param compensation
     * @return
     */
    int updateAccountByCompensationDao(Compensation compensation);


    /**
     * 查看员工和经理
     * @return
     */
    List<Compensation> lookCompensationAllDao();
}
