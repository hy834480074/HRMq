package com.example.demo.dao;

import com.example.demo.entity.Compensation;
import com.example.demo.entity.Staff;
import com.example.demo.utils.DateUtil;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Calendar;
import java.util.Date;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CompensationDaoTest {
    @Autowired
    private CompensationDao compensationDao;
    @Test
    public void checkAccountByCompensationDao() {
        Staff staff = new Staff();
        staff.setId(58);
        Compensation compensation = new Compensation();
        compensation.setStaff(staff);
        String s = DateUtil.dateYear();
        compensation.setCompensationDate(s);
        System.out.println(compensation);
        List<Compensation> compensations = compensationDao.checkAccountByCompensationDao(compensation);
        System.out.println(compensations.get(0));
    }

    @Test
    public void updateAccountByCompensationDao() {
        Staff staff = new Staff();
        staff.setId(58);
        Compensation compensation = new Compensation();
        compensation.setStaff(staff);

    }

    @Test
    public void pp(){
        Calendar calendar = Calendar.getInstance();
        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH) + 1;

        String a=year + "-";
        String b=month + "";
        if(b.length()!=2){
            b = "0"+b;
        }
        String datetime = a+b;
        System.err.println(datetime);

    }
}