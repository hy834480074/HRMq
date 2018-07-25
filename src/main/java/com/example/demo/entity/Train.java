package com.example.demo.entity;



/**
 * 培训
 */
public class Train{
    private Integer id;

    /**
     * 培训标题
     *
     * @mbg.generated
     */
    private String trainSubject;

    /**
     * 培训内容
     *
     * @mbg.generated
     */
    private String trainContext;

    /**
     * 用户id
     *
     * @mbg.generated
     */
    private Staff staff;

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
        return "Train{" +
                "id=" + id +
                ", trainSubject='" + trainSubject + '\'' +
                ", trainContext='" + trainContext + '\'' +
                ", staff=" + staff +
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

    public String getTrainSubject() {
        return trainSubject;
    }

    public void setTrainSubject(String trainSubject) {
        this.trainSubject = trainSubject;
    }

    public String getTrainContext() {
        return trainContext;
    }

    public void setTrainContext(String trainContext) {
        this.trainContext = trainContext;
    }

    public Staff getStaff() {
        return staff;
    }

    public void setStaff(Staff staff) {
        this.staff = staff;
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

    public Train() {

    }

    public Train(Integer id, String trainSubject, String trainContext, Staff staff, Department department, Position position) {

        this.id = id;
        this.trainSubject = trainSubject;
        this.trainContext = trainContext;
        this.staff = staff;
        this.department = department;
        this.position = position;
    }
}