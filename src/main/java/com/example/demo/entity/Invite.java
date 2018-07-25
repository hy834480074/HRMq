package com.example.demo.entity;


/**
 * 招聘类
 */
public class Invite  {
    private Integer id;

    /**
     * 招聘标题
     *
     * @mbg.generated
     */
    private String inviteTitle;

    /**
     * 招聘信息
     *
     * @mbg.generated
     */
    private String inviteContext;

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
        return "Invite{" +
                "id=" + id +
                ", inviteTitle='" + inviteTitle + '\'' +
                ", inviteContext='" + inviteContext + '\'' +
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

    public String getInviteTitle() {
        return inviteTitle;
    }

    public void setInviteTitle(String inviteTitle) {
        this.inviteTitle = inviteTitle;
    }

    public String getInviteContext() {
        return inviteContext;
    }

    public void setInviteContext(String inviteContext) {
        this.inviteContext = inviteContext;
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

    public Invite() {

    }

    public Invite(Integer id, String inviteTitle, String inviteContext, Department department, Position position) {

        this.id = id;
        this.inviteTitle = inviteTitle;
        this.inviteContext = inviteContext;
        this.department = department;
        this.position = position;
    }
}