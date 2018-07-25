package com.example.demo.entity;


import java.sql.Timestamp;

/**
 * 离职类
 */
public class Leaveoffice {
    private Integer id;

    /**
     * 员工id
     *
     * @mbg.generated
     */
    /**
     * 员工name
     *
     * @mbg.generated
     */
    private Staff staff;


    /**
     * 离职原因
     *
     * @mbg.generated
     */
    private String leaveContext;

    /**
     * 离职时间
     *
     * @mbg.generated
     */
    private Timestamp leaveTime;

    @Override
    public String toString() {
        return "Leaveoffice{" +
                "id=" + id +
                ", staff=" + staff +
                ", leaveContext='" + leaveContext + '\'' +
                ", leaveTime=" + leaveTime +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Staff getStaff() {
        return staff;
    }

    public void setStaff(Staff staff) {
        this.staff = staff;
    }

    public String getLeaveContext() {
        return leaveContext;
    }

    public void setLeaveContext(String leaveContext) {
        this.leaveContext = leaveContext;
    }

    public Timestamp getLeaveTime() {
        return leaveTime;
    }

    public void setLeaveTime(Timestamp leaveTime) {
        this.leaveTime = leaveTime;
    }

    public Leaveoffice() {

    }

    public Leaveoffice(Integer id, Staff staff, String leaveContext, Timestamp leaveTime) {

        this.id = id;
        this.staff = staff;
        this.leaveContext = leaveContext;
        this.leaveTime = leaveTime;
    }
}