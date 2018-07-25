package com.example.demo.entity;



/**
 * 工资
 */
public class Compensation{
    private Integer id;

    /**
     * 基本工资
     *
     * @mbg.generated
     */
    private Double compensationBasicBonus;

    /**
     * 绩效工资
     *
     * @mbg.generated
     */
    private Double compensationPerformanceBonus;

    /**
     * 特殊贡献奖
     *
     * @mbg.generated
     */
    private Double compensationSpecialBonus;

    /**
     * 社保
     *
     * @mbg.generated
     */
    private Double compensationSocialSecurity;

    /**
     * 用户id
     *
     * @mbg.generated
     */
    private Staff staff;

    /**
     * 总工资
     */
    private Double compensationAll;

    /**
     * 工资日期
     */
    private String compensationDate;
    /**
     * 1员工 2 经理 3 部门经理
     */
    private int compensationOffer;

    public Compensation() {
    }

    @Override
    public String toString() {
        return "Compensation{" +
                "id=" + id +
                ", compensationBasicBonus=" + compensationBasicBonus +
                ", compensationPerformanceBonus=" + compensationPerformanceBonus +
                ", compensationSpecialBonus=" + compensationSpecialBonus +
                ", compensationSocialSecurity=" + compensationSocialSecurity +
                ", staff=" + staff +
                ", compensationAll=" + compensationAll +
                ", compensationDate='" + compensationDate + '\'' +
                ", compensationOffer=" + compensationOffer +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Double getCompensationBasicBonus() {
        return compensationBasicBonus;
    }

    public void setCompensationBasicBonus(Double compensationBasicBonus) {
        this.compensationBasicBonus = compensationBasicBonus;
    }

    public Double getCompensationPerformanceBonus() {
        return compensationPerformanceBonus;
    }

    public void setCompensationPerformanceBonus(Double compensationPerformanceBonus) {
        this.compensationPerformanceBonus = compensationPerformanceBonus;
    }

    public Double getCompensationSpecialBonus() {
        return compensationSpecialBonus;
    }

    public void setCompensationSpecialBonus(Double compensationSpecialBonus) {
        this.compensationSpecialBonus = compensationSpecialBonus;
    }

    public Double getCompensationSocialSecurity() {
        return compensationSocialSecurity;
    }

    public void setCompensationSocialSecurity(Double compensationSocialSecurity) {
        this.compensationSocialSecurity = compensationSocialSecurity;
    }

    public Staff getStaff() {
        return staff;
    }

    public void setStaff(Staff staff) {
        this.staff = staff;
    }

    public Double getCompensationAll() {
        return compensationAll;
    }

    public void setCompensationAll(Double compensationAll) {
        this.compensationAll = compensationAll;
    }

    public String getCompensationDate() {
        return compensationDate;
    }

    public void setCompensationDate(String compensationDate) {
        this.compensationDate = compensationDate;
    }

    public int getCompensationOffer() {
        return compensationOffer;
    }

    public void setCompensationOffer(int compensationOffer) {
        this.compensationOffer = compensationOffer;
    }

    public Compensation(Integer id, Double compensationBasicBonus, Double compensationPerformanceBonus, Double compensationSpecialBonus, Double compensationSocialSecurity, Staff staff, Double compensationAll, String compensationDate, int compensationOffer) {

        this.id = id;
        this.compensationBasicBonus = compensationBasicBonus;
        this.compensationPerformanceBonus = compensationPerformanceBonus;
        this.compensationSpecialBonus = compensationSpecialBonus;
        this.compensationSocialSecurity = compensationSocialSecurity;
        this.staff = staff;
        this.compensationAll = compensationAll;
        this.compensationDate = compensationDate;
        this.compensationOffer = compensationOffer;
    }
}