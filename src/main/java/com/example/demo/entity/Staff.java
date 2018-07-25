package com.example.demo.entity;


/**
 * 用户
 */
public class Staff {
    private Integer id;

    /**
     * 员工工号
     */
    private Integer staffJobNumber;
    /**
     * 用户姓名
     *
     * @mbg.generated
     */
    private String staffName;

    /**
     * 用户密码
     *
     * @mbg.generated
     */
    private String staffPassword;

    /**
     * 性别
     *
     * @mbg.generated
     */
    private String staffSex;

    /**
     * 状态
     *
     * @mbg.generated
     */
    private String staffOffer;

    /**
     * 简历id
     *
     * @mbg.generated
     */
    private Resume resume;

    /**
     * 账户登录
     *
     * @mbg.generated
     */
    private String staffAccount;

    /**
     * 部门id
     *
     * @mbg.generated
     */
    private Department department;

    /**
     * 职位id
     *
     * @mbg.generated
     */
    private Position position;


    @Override
    public String toString() {
        return "Staff{" +
                "id=" + id +
                ", staffJobNumber=" + staffJobNumber +
                ", staffName='" + staffName + '\'' +
                ", staffPassword='" + staffPassword + '\'' +
                ", staffSex='" + staffSex + '\'' +
                ", staffOffer='" + staffOffer + '\'' +
                ", resume=" + resume +
                ", staffAccount='" + staffAccount + '\'' +
                ", department=" + department +
                ", position=" + position +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getStaffJobNumber() {
        return staffJobNumber;
    }

    public void setStaffJobNumber(Integer staffJobNumber) {
        this.staffJobNumber = staffJobNumber;
    }

    public String getStaffName() {
        return staffName;
    }

    public void setStaffName(String staffName) {
        this.staffName = staffName;
    }

    public String getStaffPassword() {
        return staffPassword;
    }

    public void setStaffPassword(String staffPassword) {
        this.staffPassword = staffPassword;
    }

    public String getStaffSex() {
        return staffSex;
    }

    public void setStaffSex(String staffSex) {
        this.staffSex = staffSex;
    }

    public String getStaffOffer() {
        return staffOffer;
    }

    public void setStaffOffer(String staffOffer) {
        this.staffOffer = staffOffer;
    }

    public Resume getResume() {
        return resume;
    }

    public void setResume(Resume resume) {
        this.resume = resume;
    }

    public String getStaffAccount() {
        return staffAccount;
    }

    public void setStaffAccount(String staffAccount) {
        this.staffAccount = staffAccount;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public Staff() {

    }

    public Staff(Integer id, Integer staffJobNumber, String staffName, String staffPassword, String staffSex, String staffOffer, Resume resume, String staffAccount, Department department, Position position) {

        this.id = id;
        this.staffJobNumber = staffJobNumber;
        this.staffName = staffName;
        this.staffPassword = staffPassword;
        this.staffSex = staffSex;
        this.staffOffer = staffOffer;
        this.resume = resume;
        this.staffAccount = staffAccount;
        this.department = department;
        this.position = position;
    }
}