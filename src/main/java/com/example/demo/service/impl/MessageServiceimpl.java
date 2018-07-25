package com.example.demo.service.impl;

import com.example.demo.dao.MessageDao;
import com.example.demo.entity.Message;
import com.example.demo.entity.Staff;
import com.example.demo.service.MessageService;
import com.example.demo.utils.ObjUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("messageService")
public class MessageServiceimpl implements MessageService {
    @Autowired
    private MessageDao messageDao;
    @Override
    public int selectById() {
        Staff staff = ObjUtil.getStaff();
        Message message = new Message();
        message.setStaff(staff);
        return messageDao.selectByIdDao(message);
    }
}
