package com.example.demo.service;

import com.example.demo.entity.Resume;

import java.util.List;

public interface ResumeService {
    /**
     * 添加简历
     * @param resume
     * @return
     */
    boolean registerResume(Resume resume);

    /**
     * 查看简历
     * @return
     */
    List<Resume> selectAllResume();

    /**
     * 查看自己简历
     * @return
     */
   Resume lookMeResume();



   int registerXiuGaiResume(Resume resume);
}
