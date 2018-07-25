package com.example.demo.service.impl;

import com.example.demo.dao.LeaveofficeDao;
import com.example.demo.dao.StaffDao;
import com.example.demo.entity.Leaveoffice;
import com.example.demo.entity.Staff;
import com.example.demo.service.LeaveofficeService;
import com.example.demo.utils.DateUtil;
import com.example.demo.utils.ObjUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service("leaveofficeService")
public class LeaveofficeServiceimpl implements LeaveofficeService {
    @Autowired
    private LeaveofficeDao leaveofficeDao;
    @Autowired
    private StaffDao staffDao;

    @Override
    public int addLeaveOffice(Leaveoffice leaveoffice) {
        Staff staff = ObjUtil.getStaff();
        staff.setStaffOffer("临时");
        staffDao.updataStaffDaoByOffer(staff);
        System.out.println(staff);
        leaveoffice.setStaff(staff);
        leaveoffice.setLeaveTime(DateUtil.datetime());
        System.out.println(leaveoffice);
        return leaveofficeDao.addLeaveOfficeDao(leaveoffice);
    }
}
