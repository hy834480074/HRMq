package com.example.demo.service.impl;

import com.example.demo.dao.PositionDao;
import com.example.demo.entity.Position;
import com.example.demo.service.PositionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service("positionService")
public class PositionServiceimpl implements PositionService {
    @Autowired
    private PositionDao positionDao;
    @Override
    public List<Position> lookPositionAll() {
        return positionDao.lookPositionAllDao();
    }
}
