package com.example.demo.dao;

import com.example.demo.entity.Department;
import com.example.demo.entity.Invite;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.*;
@RunWith(SpringRunner.class)
@SpringBootTest
public class InviteDaoTest {
    @Autowired
    private InviteDao inviteDao;
    @Test
    public void registerInviteDao() {
        Invite invite = new Invite();
        invite.setInviteTitle("苍井空");
        invite.setInviteContext("今天不做事不接客");
        Department d = new Department();
        d.setId(1);
        System.out.println(d);
        invite.setDepartment(d);
        inviteDao.registerInviteDao(invite);
    }

    @Test
    public void selectAll() {
        List<Invite> invites = inviteDao.selectAllDao();
        System.out.println(invites.size());
    }
}