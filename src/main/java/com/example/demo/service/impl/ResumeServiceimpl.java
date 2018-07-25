package com.example.demo.service.impl;

import com.example.demo.dao.ResumeDao;
import com.example.demo.entity.Resume;
import com.example.demo.entity.Staff;
import com.example.demo.service.ResumeService;
import com.example.demo.utils.ObjUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service("resumeService")
public class ResumeServiceimpl implements ResumeService {
    @Autowired
    private ResumeDao resumeDao;

    @Override
    public boolean registerResume(Resume resume) {
        Staff staff = ObjUtil.getStaff();
        System.out.println(staff.getId());
        resume.setStaff(staff);
        resume.setResumOffer("未读");
        if(resumeDao.registerResumeDao(resume)>0){
            return true;
        }
        return false;
    }

    @Override
    public List<Resume> selectAllResume() {
        return resumeDao.selectAllResumeDao();
    }

    @Override
    public Resume lookMeResume() {
        Staff staff = ObjUtil.getStaff();
        Resume resume = new Resume();
        resume.setStaff(staff);
        return resumeDao.lookMeResumeDao(resume);
    }

    @Override
    public int registerXiuGaiResume(Resume resume) {
        Staff staff = ObjUtil.getStaff();
        resume.setStaff(staff);
        return resumeDao.registerXiuGaiResumeDao(resume);
    }
}
