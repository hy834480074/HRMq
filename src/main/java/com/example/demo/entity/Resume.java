package com.example.demo.entity;;


/**
 * 简历
 */
public class Resume{
    private Integer id;

    /**
     * 姓名
     *
     * @mbg.generated
     */
    private String resumeName;

    /**
     * 求职意向
     *
     * @mbg.generated
     */
    private String resumeContent;

    /**
     * 居住城市
     *
     * @mbg.generated
     */
    private String resumeCity;

    /**
     * 联系方式
     *
     * @mbg.generated
     */
    private String resumeTel;

    /**
     * 邮箱地址
     *
     * @mbg.generated
     */
    private String resumeEmail;

    /**
     * 政治面貌
     *
     * @mbg.generated
     */
    private String resumeFace;

    /**
     * 工作经验
     *
     * @mbg.generated
     */
    private String resumExperient;

    /**
     * 学历
     *
     * @mbg.generated
     */
    private String resumEducation;

    /**
     * 用户id
     *
     * @mbg.generated
     */
    private Staff staff;
    /**
     * 已读/未读
     */
    private String resumOffer;


    @Override
    public String toString() {
        return "Resume{" +
                "id=" + id +
                ", resumeName='" + resumeName + '\'' +
                ", resumeContent='" + resumeContent + '\'' +
                ", resumeCity='" + resumeCity + '\'' +
                ", resumeTel='" + resumeTel + '\'' +
                ", resumeEmail='" + resumeEmail + '\'' +
                ", resumeFace='" + resumeFace + '\'' +
                ", resumExperient='" + resumExperient + '\'' +
                ", resumEducation='" + resumEducation + '\'' +
                ", staff=" + staff +
                ", resumOffer='" + resumOffer + '\'' +
                '}';
    }

    public Resume(Integer id, String resumeName, String resumeContent, String resumeCity, String resumeTel, String resumeEmail, String resumeFace, String resumExperient, String resumEducation, Staff staff, String resumOffer) {
        this.id = id;
        this.resumeName = resumeName;
        this.resumeContent = resumeContent;
        this.resumeCity = resumeCity;
        this.resumeTel = resumeTel;
        this.resumeEmail = resumeEmail;
        this.resumeFace = resumeFace;
        this.resumExperient = resumExperient;
        this.resumEducation = resumEducation;
        this.staff = staff;
        this.resumOffer = resumOffer;
    }

    public Resume() {

    }

    public Integer getId() {

        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getResumeName() {
        return resumeName;
    }

    public void setResumeName(String resumeName) {
        this.resumeName = resumeName;
    }

    public String getResumeContent() {
        return resumeContent;
    }

    public void setResumeContent(String resumeContent) {
        this.resumeContent = resumeContent;
    }

    public String getResumeCity() {
        return resumeCity;
    }

    public void setResumeCity(String resumeCity) {
        this.resumeCity = resumeCity;
    }

    public String getResumeTel() {
        return resumeTel;
    }

    public void setResumeTel(String resumeTel) {
        this.resumeTel = resumeTel;
    }

    public String getResumeEmail() {
        return resumeEmail;
    }

    public void setResumeEmail(String resumeEmail) {
        this.resumeEmail = resumeEmail;
    }

    public String getResumeFace() {
        return resumeFace;
    }

    public void setResumeFace(String resumeFace) {
        this.resumeFace = resumeFace;
    }

    public String getResumExperient() {
        return resumExperient;
    }

    public void setResumExperient(String resumExperient) {
        this.resumExperient = resumExperient;
    }

    public String getResumEducation() {
        return resumEducation;
    }

    public void setResumEducation(String resumEducation) {
        this.resumEducation = resumEducation;
    }

    public Staff getStaff() {
        return staff;
    }

    public void setStaff(Staff staff) {
        this.staff = staff;
    }

    public String getResumOffer() {
        return resumOffer;
    }

    public void setResumOffer(String resumOffer) {
        this.resumOffer = resumOffer;
    }
}