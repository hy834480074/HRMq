package com.example.demo.entity;


import java.sql.Timestamp;
/**
 * 加班
 */
public class Overtime{
    private Long id;

    /**
     * 员工id
     *
     * @mbg.generated
     */
    private Staff staff;

    /**
     * 开始时间
     *
     * @mbg.generated
     */
    private Timestamp overtimeStart;

    /**
     * 结束时间
     *
     * @mbg.generated
     */
    private Timestamp overtimeEnd;

    /**
     * 加班金额
     *
     * @mbg.generated
     */
    private Double overtimeMoeny;

    /**
     * 原因
     *
     * @mbg.generated
     */
    private String overtimeCause;

    @Override
    public String toString() {
        return "Overtime{" +
                "id=" + id +
                ", staff=" + staff +
                ", overtimeStart=" + overtimeStart +
                ", overtimeEnd=" + overtimeEnd +
                ", overtimeMoeny=" + overtimeMoeny +
                ", overtimeCause='" + overtimeCause + '\'' +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Staff getStaff() {
        return staff;
    }

    public void setStaff(Staff staff) {
        this.staff = staff;
    }

    public Timestamp getOvertimeStart() {
        return overtimeStart;
    }

    public void setOvertimeStart(Timestamp overtimeStart) {
        this.overtimeStart = overtimeStart;
    }

    public Timestamp getOvertimeEnd() {
        return overtimeEnd;
    }

    public void setOvertimeEnd(Timestamp overtimeEnd) {
        this.overtimeEnd = overtimeEnd;
    }

    public Double getOvertimeMoeny() {
        return overtimeMoeny;
    }

    public void setOvertimeMoeny(Double overtimeMoeny) {
        this.overtimeMoeny = overtimeMoeny;
    }

    public String getOvertimeCause() {
        return overtimeCause;
    }

    public void setOvertimeCause(String overtimeCause) {
        this.overtimeCause = overtimeCause;
    }

    public Overtime() {

    }

    public Overtime(Long id, Staff staff, Timestamp overtimeStart, Timestamp overtimeEnd, Double overtimeMoeny, String overtimeCause) {

        this.id = id;
        this.staff = staff;
        this.overtimeStart = overtimeStart;
        this.overtimeEnd = overtimeEnd;
        this.overtimeMoeny = overtimeMoeny;
        this.overtimeCause = overtimeCause;
    }
}