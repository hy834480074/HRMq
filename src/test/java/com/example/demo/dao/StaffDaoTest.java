package com.example.demo.dao;

import com.example.demo.entity.Staff;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;
@RunWith(SpringRunner.class)
@SpringBootTest
public class StaffDaoTest {
    @Autowired
    private StaffDao staffDao;
    @Test
    public void registerStaffDao() {
        Staff staff = new Staff();
        staff.setStaffAccount("你是我");
        staff.setStaffPassword("1231");
        staffDao.registerStaffDao(staff);
    }

    @Test
    public void checkAccount() {
        Staff staff = new Staff();
        staff.setStaffAccount("aaaaaa");
        staff.setStaffPassword("aaaaaa");
        System.err.println(staffDao.checkAccount(staff));
    }


    @Test
    public void checkAccountById() {
        System.err.println(staffDao.checkAccountById(1));
    }

    @Test
    public void checkAccountByAccountDao() {
        Staff staff = new Staff();
        staff.setStaffAccount("123");
        System.out.println(staffDao.checkAccountByAccountDao(staff));
    }

    @Test
    public void updataStaffByOffer() {
        Staff staff = new Staff();
        staff.setId(65);
        staff.setStaffOffer("ok");
        int i = staffDao.updataStaffDaoByOffer(staff);
        System.out.println(i);
    }
}