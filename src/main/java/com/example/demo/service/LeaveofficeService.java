package com.example.demo.service;

import com.example.demo.entity.Leaveoffice;

public interface LeaveofficeService {

    /**
     * 添加一条新的离职记录
     * @param leaveoffice
     * @return
     */
    int addLeaveOffice(Leaveoffice leaveoffice);
}
