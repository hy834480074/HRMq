package com.example.demo.dao;

import com.example.demo.entity.Leaveoffice;
import com.example.demo.entity.Staff;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;
@RunWith(SpringRunner.class)
@SpringBootTest
public class LeaveofficeDaoTest {
    @Autowired
    private LeaveofficeDao leaveofficeDao;
    @Test
    public void addLeaveOfficeDao() {
        Staff staff = new Staff();
        staff.setId(22);
        staff.setStaffName("asd");
        Leaveoffice leaveoffice = new Leaveoffice();
        leaveoffice.setStaff(staff);
        leaveofficeDao.addLeaveOfficeDao(leaveoffice);
    }
}