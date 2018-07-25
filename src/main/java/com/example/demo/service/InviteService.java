package com.example.demo.service;

import com.example.demo.entity.Invite;

import java.util.List;

public interface InviteService {
    /**
     * 添加一个招聘信息需要包含部门id
     * @param invite
     * @return
     */
    boolean registerInvite(Invite invite);

    /**
     * 职位
     * 包括部门
     * 查询招聘信息全部
     * @return
     */
    List<Invite> selectAllInvite();

}
