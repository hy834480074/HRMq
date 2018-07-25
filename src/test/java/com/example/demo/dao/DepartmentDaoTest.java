package com.example.demo.dao;

import com.example.demo.entity.Department;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.*;
@RunWith(SpringRunner.class)
@SpringBootTest
public class DepartmentDaoTest {
    @Autowired
    private DepartmentDao departmentDao;
    @Test
    public void lookDepartmentAllDao() {
        List<Department> departments = departmentDao.lookDepartmentAllDao();
        for (int i=0;i<departments.size();i++){
            System.err.println(departments.get(i));
        }
    }
}