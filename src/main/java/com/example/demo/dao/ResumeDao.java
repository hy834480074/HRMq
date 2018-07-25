package com.example.demo.dao;

import com.example.demo.entity.Resume;
import com.example.demo.entity.Staff;

import java.util.List;

public interface ResumeDao {
    /**
     * 添加简历
     * @param resume
     * @return
     */
    int registerResumeDao(Resume resume);

    /**
     * 查看简历
     * @return
     */
    List<Resume> selectAllResumeDao();

    /**
     * 验证自己是否有简历
     * @param
     * @return
     */
   Resume lookMeResumeDao(Resume resume);

    /**
     * 修改简历
     * @param resume
     * @return
     */
   int registerXiuGaiResumeDao(Resume resume);
}
