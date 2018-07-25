package com.example.demo.dao;

import com.example.demo.entity.Message;

public interface MessageDao {

    /**
     * 查询未读的多少条根据id
     * @param message
     * @return
     */
   int selectByIdDao(Message message);
}
