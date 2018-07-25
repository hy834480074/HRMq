package com.example.demo.service.impl;

import com.example.demo.dao.InviteDao;
import com.example.demo.entity.Invite;
import com.example.demo.service.InviteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("inviteService")
public class InviteServiceimpl implements InviteService {
    @Autowired
    private InviteDao inviteDao;

    @Override
    public boolean registerInvite(Invite invite) {
        if(inviteDao.registerInviteDao(invite)!=0){
            return true;
        }
        return false;
    }

    @Override
    public List<Invite> selectAllInvite() {
        return inviteDao.selectAllDao();
    }
}
