package com.example.demo.dao;

import com.example.demo.entity.Resume;
import com.example.demo.entity.Staff;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;
@RunWith(SpringRunner.class)
@SpringBootTest
public class ResumeDaoTest {
    @Autowired
    private ResumeDao resumeDao;



    @Test
    public void registerResumeDao() {
        Resume resume = new Resume();
        resume.setResumeName("123");
        resume.setResumeContent("123");
        resume.setResumeCity("123");
        resume.setResumeTel("12331231232");
        resume.setResumeEmail("123@q23.com");
        resume.setResumeFace("123");
        resume.setResumExperient("123");
        resume.setResumEducation("123");
        Staff staff = new Staff();
        staff.setId(1);
        resume.setStaff(staff);
        System.out.println(resumeDao.registerResumeDao(resume));
    }

    @Test
    public void selectAllResume() {
        System.out.println(resumeDao.selectAllResumeDao().size());

    }

    @Test
    public void lookMeResumeDao() {
        Staff staff = new Staff();
        staff.setId(59);
        Resume resume = new Resume();
        resume.setStaff(staff);
        System.out.println(resumeDao.lookMeResumeDao(resume));
    }

    @Test
    public void registerXiuGaiResumeDao() {
        Staff staff = new Staff();
        staff.setId(58);
        Resume resume = new Resume();
        resume.setStaff(staff);
        resume.setResumExperient("asdasd");
        resumeDao.registerXiuGaiResumeDao(resume);

    }
}