package com.example.demo.entity;

import java.sql.Timestamp;

/**
 * 消息类
 */
public class Message{
    private Integer id;

    /**
     * 消息创建时间
     *
     * @mbg.generated
     */
    private Timestamp messageCreateTime;

    /**
     * 角色消息id
     *
     * @mbg.generated
     */
    private Staff staff;

    /**
     * 状态0未读1已读
     *
     * @mbg.generated
     */
    private Integer messageTargetId;

    /**
     * 发送消息内容
     *
     * @mbg.generated
     */
    private String messageContext;

    /**
     * 处理进程
     *
     * @mbg.generated
     */
    private String messageCourse;

    @Override
    public String toString() {
        return "Message{" +
                "id=" + id +
                ", messageCreateTime=" + messageCreateTime +
                ", staff=" + staff +
                ", messageTargetId=" + messageTargetId +
                ", messageContext='" + messageContext + '\'' +
                ", messageCourse='" + messageCourse + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Timestamp getMessageCreateTime() {
        return messageCreateTime;
    }

    public void setMessageCreateTime(Timestamp messageCreateTime) {
        this.messageCreateTime = messageCreateTime;
    }

    public Staff getStaff() {
        return staff;
    }

    public void setStaff(Staff staff) {
        this.staff = staff;
    }

    public Integer getMessageTargetId() {
        return messageTargetId;
    }

    public void setMessageTargetId(Integer messageTargetId) {
        this.messageTargetId = messageTargetId;
    }

    public String getMessageContext() {
        return messageContext;
    }

    public void setMessageContext(String messageContext) {
        this.messageContext = messageContext;
    }

    public String getMessageCourse() {
        return messageCourse;
    }

    public void setMessageCourse(String messageCourse) {
        this.messageCourse = messageCourse;
    }

    public Message() {

    }

    public Message(Integer id, Timestamp messageCreateTime, Staff staff, Integer messageTargetId, String messageContext, String messageCourse) {

        this.id = id;
        this.messageCreateTime = messageCreateTime;
        this.staff = staff;
        this.messageTargetId = messageTargetId;
        this.messageContext = messageContext;
        this.messageCourse = messageCourse;
    }
}