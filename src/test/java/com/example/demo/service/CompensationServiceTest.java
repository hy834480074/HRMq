package com.example.demo.service;

import com.example.demo.entity.Compensation;
import com.example.demo.entity.Staff;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.*;
@RunWith(SpringRunner.class)
@SpringBootTest
public class CompensationServiceTest {

    @Autowired
    private CompensationService compensationService;
    @Test
    public void checkAccountByCompensation() {
        Staff staff = new Staff();
        staff.setId(58);
    }
}