package com.example.demo.entity;


import java.sql.Timestamp;

/**
 * 部门类
 */
public class Department{
    private Integer id;

    /**
     * 部门名字
     *
     * @mbg.generated
     */
    private String departmentName;

    /**
     * 部门创建时间
     *
     * @mbg.generated
     */
    private Timestamp departmentCreateTime;

    @Override
    public String toString() {
        return "Department{" +
                "id=" + id +
                ", departmentName='" + departmentName + '\'' +
                ", departmentCreateTime=" + departmentCreateTime +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public Timestamp getDepartmentCreateTime() {
        return departmentCreateTime;
    }

    public void setDepartmentCreateTime(Timestamp departmentCreateTime) {
        this.departmentCreateTime = departmentCreateTime;
    }

    public Department() {

    }

    public Department(Integer id, String departmentName, Timestamp departmentCreateTime) {

        this.id = id;
        this.departmentName = departmentName;
        this.departmentCreateTime = departmentCreateTime;
    }
}