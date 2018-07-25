package com.example.demo.entity;

import java.sql.Timestamp;

/**
 * 惩罚表
 */
public class Rewardandpunishment {
    private Integer id;

    /**
     * 奖惩信息
     *
     * @mbg.generated
     */
    private String rapMes;

    /**
     * 奖惩时间
     *
     * @mbg.generated
     */
    private Timestamp rapDate;

    /**
     * 奖惩金额
     *
     * @mbg.generated
     */
    private Double rapMoeny;

    /**
     * 员工id
     *
     * @mbg.generated
     */
    private Staff staff;


    @Override
    public String toString() {
        return "Rewardandpunishment{" +
                "id=" + id +
                ", rapMes='" + rapMes + '\'' +
                ", rapDate=" + rapDate +
                ", rapMoeny=" + rapMoeny +
                ", staff=" + staff +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRapMes() {
        return rapMes;
    }

    public void setRapMes(String rapMes) {
        this.rapMes = rapMes;
    }

    public Timestamp getRapDate() {
        return rapDate;
    }

    public void setRapDate(Timestamp rapDate) {
        this.rapDate = rapDate;
    }

    public Double getRapMoeny() {
        return rapMoeny;
    }

    public void setRapMoeny(Double rapMoeny) {
        this.rapMoeny = rapMoeny;
    }

    public Staff getStaff() {
        return staff;
    }

    public void setStaff(Staff staff) {
        this.staff = staff;
    }

    public Rewardandpunishment() {

    }

    public Rewardandpunishment(Integer id, String rapMes, Timestamp rapDate, Double rapMoeny, Staff staff) {

        this.id = id;
        this.rapMes = rapMes;
        this.rapDate = rapDate;
        this.rapMoeny = rapMoeny;
        this.staff = staff;
    }
}