package com.example.demo.dao;

import com.example.demo.entity.Message;
import com.example.demo.entity.Staff;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;
@RunWith(SpringRunner.class)
@SpringBootTest
public class MessageDaoTest {
    @Autowired
    private MessageDao messageDao;
    @Test
    public void selectByIdDao() {
        Staff staff = new Staff();
        staff.setId(13);
        Message message = new Message();
        message.setStaff(staff);
        messageDao.selectByIdDao(message);
    }
}