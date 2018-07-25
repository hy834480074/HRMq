package com.example.demo.dao;

import com.example.demo.entity.Department;

import java.util.List;

public interface DepartmentDao {

    /**
     * 查看所有部门
     * @return
     */
    List<Department> lookDepartmentAllDao();
}
