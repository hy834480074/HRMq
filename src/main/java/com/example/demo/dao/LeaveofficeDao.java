package com.example.demo.dao;

import com.example.demo.entity.Leaveoffice;

public interface LeaveofficeDao{
    /**
     * 离职信息填写
     * @return
     */
   int addLeaveOfficeDao(Leaveoffice leaveoffice);
}
