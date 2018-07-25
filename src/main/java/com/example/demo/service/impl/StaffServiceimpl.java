package com.example.demo.service.impl;

import com.example.demo.dao.StaffDao;
import com.example.demo.entity.Staff;
import com.example.demo.service.StaffService;
import com.example.demo.utils.DateUtil;
import com.example.demo.utils.ObjUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("StaffService")
@Repository
public class StaffServiceimpl implements StaffService {
    @Autowired
    StaffDao staffDao;

    @Override
    @Transactional
    public boolean register(Staff staff) {

        if(staffDao.checkAccountByAccountDao(staff)!=null){
            return false;
        }else {
            staff.setStaffOffer("临时");
            staffDao.registerStaffDao(staff);
            System.err.println(staff);
            Staff staff1 = staffDao.checkAccountByAccountDao(staff);
            System.err.println(staff1);
            ObjUtil.setStaff(staff1);
            return true;
        }

    }

    @Override
    public Staff checkAccount(Staff staff) {
        Staff staff1 = staffDao.checkAccount(staff);
        ObjUtil.setStaff(staff1);
        return  staff1;
    }

    @Override
    public int updataStaff(Staff staff) {
        return staffDao.updataStaffDao(staff);
    }
}
