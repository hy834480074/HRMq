package com.example.demo.utils;

import com.example.demo.dao.StaffDao;
import com.example.demo.entity.Staff;
import org.springframework.beans.factory.annotation.Autowired;

public class ObjUtil {
    private static Staff staff;

    public static Staff getStaff() {
        return staff;
    }

    public static void setStaff(Staff staff) {
        ObjUtil.staff = staff;
    }
}
