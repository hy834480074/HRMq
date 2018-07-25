package com.example.demo.service.impl;

import com.example.demo.dao.DepartmentDao;
import com.example.demo.entity.Department;
import com.example.demo.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service("departmentService")
public class DepartmentServiceimpl implements DepartmentService {
    @Autowired
    private DepartmentDao departmentDao;
    @Override
    public List<Department> lookDepartmentAll() {
        return departmentDao.lookDepartmentAllDao();
    }
}
