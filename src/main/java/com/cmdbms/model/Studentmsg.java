package com.cmdbms.model;

import java.util.Date;

public class Studentmsg {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_student_msg.id
     *
     * @mbg.generated Wed May 29 11:15:17 CST 2019
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_student_msg.name
     *
     * @mbg.generated Wed May 29 11:15:17 CST 2019
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_student_msg.grade
     *
     * @mbg.generated Wed May 29 11:15:17 CST 2019
     */
    private Integer grade;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_student_msg.sex
     *
     * @mbg.generated Wed May 29 11:15:17 CST 2019
     */
    private String sex;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_student_msg.birthday
     *
     * @mbg.generated Wed May 29 11:15:17 CST 2019
     */
    private Date birthday;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_student_msg.nativePlace
     *
     * @mbg.generated Wed May 29 11:15:17 CST 2019
     */
    private String nativePlace;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_student_msg.idType
     *
     * @mbg.generated Wed May 29 11:15:17 CST 2019
     */
    private String idType;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_student_msg.idNunber
     *
     * @mbg.generated Wed May 29 11:15:17 CST 2019
     */
    private String idNunber;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_student_msg.phone
     *
     * @mbg.generated Wed May 29 11:15:17 CST 2019
     */
    private String phone;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_student_msg.parentPhone
     *
     * @mbg.generated Wed May 29 11:15:17 CST 2019
     */
    private String parentPhone;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_student_msg.folk
     *
     * @mbg.generated Wed May 29 11:15:17 CST 2019
     */
    private String folk;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_student_msg.politicalSt
     *
     * @mbg.generated Wed May 29 11:15:17 CST 2019
     */
    private String politicalSt;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_student_msg
     *
     * @mbg.generated Wed May 29 11:15:17 CST 2019
     */
    public Studentmsg(Integer id, String name, Integer grade, String sex, Date birthday, String nativePlace, String idType, String idNunber, String phone, String parentPhone, String folk, String politicalSt) {
        this.id = id;
        this.name = name;
        this.grade = grade;
        this.sex = sex;
        this.birthday = birthday;
        this.nativePlace = nativePlace;
        this.idType = idType;
        this.idNunber = idNunber;
        this.phone = phone;
        this.parentPhone = parentPhone;
        this.folk = folk;
        this.politicalSt = politicalSt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_student_msg
     *
     * @mbg.generated Wed May 29 11:15:17 CST 2019
     */
    public Studentmsg() {
        super();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_student_msg.id
     *
     * @return the value of t_student_msg.id
     *
     * @mbg.generated Wed May 29 11:15:17 CST 2019
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_student_msg.id
     *
     * @param id the value for t_student_msg.id
     *
     * @mbg.generated Wed May 29 11:15:17 CST 2019
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_student_msg.name
     *
     * @return the value of t_student_msg.name
     *
     * @mbg.generated Wed May 29 11:15:17 CST 2019
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_student_msg.name
     *
     * @param name the value for t_student_msg.name
     *
     * @mbg.generated Wed May 29 11:15:17 CST 2019
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_student_msg.grade
     *
     * @return the value of t_student_msg.grade
     *
     * @mbg.generated Wed May 29 11:15:17 CST 2019
     */
    public Integer getGrade() {
        return grade;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_student_msg.grade
     *
     * @param grade the value for t_student_msg.grade
     *
     * @mbg.generated Wed May 29 11:15:17 CST 2019
     */
    public void setGrade(Integer grade) {
        this.grade = grade;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_student_msg.sex
     *
     * @return the value of t_student_msg.sex
     *
     * @mbg.generated Wed May 29 11:15:17 CST 2019
     */
    public String getSex() {
        return sex;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_student_msg.sex
     *
     * @param sex the value for t_student_msg.sex
     *
     * @mbg.generated Wed May 29 11:15:17 CST 2019
     */
    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_student_msg.birthday
     *
     * @return the value of t_student_msg.birthday
     *
     * @mbg.generated Wed May 29 11:15:17 CST 2019
     */
    public Date getBirthday() {
        return birthday;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_student_msg.birthday
     *
     * @param birthday the value for t_student_msg.birthday
     *
     * @mbg.generated Wed May 29 11:15:17 CST 2019
     */
    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_student_msg.nativePlace
     *
     * @return the value of t_student_msg.nativePlace
     *
     * @mbg.generated Wed May 29 11:15:17 CST 2019
     */
    public String getNativePlace() {
        return nativePlace;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_student_msg.nativePlace
     *
     * @param nativePlace the value for t_student_msg.nativePlace
     *
     * @mbg.generated Wed May 29 11:15:17 CST 2019
     */
    public void setNativePlace(String nativePlace) {
        this.nativePlace = nativePlace == null ? null : nativePlace.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_student_msg.idType
     *
     * @return the value of t_student_msg.idType
     *
     * @mbg.generated Wed May 29 11:15:17 CST 2019
     */
    public String getIdType() {
        return idType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_student_msg.idType
     *
     * @param idType the value for t_student_msg.idType
     *
     * @mbg.generated Wed May 29 11:15:17 CST 2019
     */
    public void setIdType(String idType) {
        this.idType = idType == null ? null : idType.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_student_msg.idNunber
     *
     * @return the value of t_student_msg.idNunber
     *
     * @mbg.generated Wed May 29 11:15:17 CST 2019
     */
    public String getIdNunber() {
        return idNunber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_student_msg.idNunber
     *
     * @param idNunber the value for t_student_msg.idNunber
     *
     * @mbg.generated Wed May 29 11:15:17 CST 2019
     */
    public void setIdNunber(String idNunber) {
        this.idNunber = idNunber == null ? null : idNunber.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_student_msg.phone
     *
     * @return the value of t_student_msg.phone
     *
     * @mbg.generated Wed May 29 11:15:17 CST 2019
     */
    public String getPhone() {
        return phone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_student_msg.phone
     *
     * @param phone the value for t_student_msg.phone
     *
     * @mbg.generated Wed May 29 11:15:17 CST 2019
     */
    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_student_msg.parentPhone
     *
     * @return the value of t_student_msg.parentPhone
     *
     * @mbg.generated Wed May 29 11:15:17 CST 2019
     */
    public String getParentPhone() {
        return parentPhone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_student_msg.parentPhone
     *
     * @param parentPhone the value for t_student_msg.parentPhone
     *
     * @mbg.generated Wed May 29 11:15:17 CST 2019
     */
    public void setParentPhone(String parentPhone) {
        this.parentPhone = parentPhone == null ? null : parentPhone.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_student_msg.folk
     *
     * @return the value of t_student_msg.folk
     *
     * @mbg.generated Wed May 29 11:15:17 CST 2019
     */
    public String getFolk() {
        return folk;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_student_msg.folk
     *
     * @param folk the value for t_student_msg.folk
     *
     * @mbg.generated Wed May 29 11:15:17 CST 2019
     */
    public void setFolk(String folk) {
        this.folk = folk == null ? null : folk.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_student_msg.politicalSt
     *
     * @return the value of t_student_msg.politicalSt
     *
     * @mbg.generated Wed May 29 11:15:17 CST 2019
     */
    public String getPoliticalSt() {
        return politicalSt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_student_msg.politicalSt
     *
     * @param politicalSt the value for t_student_msg.politicalSt
     *
     * @mbg.generated Wed May 29 11:15:17 CST 2019
     */
    public void setPoliticalSt(String politicalSt) {
        this.politicalSt = politicalSt == null ? null : politicalSt.trim();
    }
}