package com.example.demo.controller;

import com.example.demo.entity.Department;
import com.example.demo.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
import java.util.List;

@RequestMapping("/compensation")
@Controller
public class DepartmentController {
    @Autowired
    private DepartmentService departmentService;
    /**
     * 查询部门
     * @return
     */
    public void departmentAll(HttpSession session){
        List<Department> departments = departmentService.lookDepartmentAll();
        session.setAttribute("departments",departments);
    }
}
