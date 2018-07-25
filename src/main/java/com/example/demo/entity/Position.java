package com.example.demo.entity;


import java.sql.Timestamp;

/**
 * 职业类
 */
public class Position{
    private Integer id;

    /**
     * 职业表名字
     *
     * @mbg.generated
     */
    private String positionName;

    /**
     * 创建时间
     *
     * @mbg.generated
     */
    private Timestamp postionCreateTime;
    /**
     * 部门
     */
    private Department department;
    private static final long serialVersionUID = 1L;

    @Override
    public String toString() {
        return "PositionDao{" +
                "id=" + id +
                ", positionName='" + positionName + '\'' +
                ", postionCreateTime=" + postionCreateTime +
                ", department=" + department +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPositionName() {
        return positionName;
    }

    public void setPositionName(String positionName) {
        this.positionName = positionName;
    }

    public Timestamp getPostionCreateTime() {
        return postionCreateTime;
    }

    public void setPostionCreateTime(Timestamp postionCreateTime) {
        this.postionCreateTime = postionCreateTime;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Position() {

    }

    public Position(Integer id, String positionName, Timestamp postionCreateTime, Department department) {

        this.id = id;
        this.positionName = positionName;
        this.postionCreateTime = postionCreateTime;
        this.department = department;
    }
}