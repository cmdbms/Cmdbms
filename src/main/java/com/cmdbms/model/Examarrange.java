package com.cmdbms.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class Examarrange {

    private Integer id;


    private Integer examSubId;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    private Date examDate;


    private Integer examTime;


    private Integer examClassroomId;


    private String examClrName;


    private String examSubName;


    private Integer exaeYear;


    public Examarrange(Integer id, Integer examSubId, Date examDate, Integer examTime, Integer examClassroomId, String examClrName, String examSubName, Integer exaeYear) {
        this.id = id;
        this.examSubId = examSubId;
        this.examDate = examDate;
        this.examTime = examTime;
        this.examClassroomId = examClassroomId;
        this.examClrName = examClrName;
        this.examSubName = examSubName;
        this.exaeYear = exaeYear;
    }


    public Examarrange() {
        super();
    }


    public Integer getId() {
        return id;
    }


    public void setId(Integer id) {
        this.id = id;
    }


    public Integer getExamSubId() {
        return examSubId;
    }


    public void setExamSubId(Integer examSubId) {
        this.examSubId = examSubId;
    }


    public Date getExamDate() {
        return examDate;
    }


    public void setExamDate(Date examDate) {
        this.examDate = examDate;
    }


    public Integer getExamTime() {
        return examTime;
    }


    public void setExamTime(Integer examTime) {
        this.examTime = examTime;
    }


    public Integer getExamClassroomId() {
        return examClassroomId;
    }


    public void setExamClassroomId(Integer examClassroomId) {
        this.examClassroomId = examClassroomId;
    }


    public String getExamClrName() {
        return examClrName;
    }


    public void setExamClrName(String examClrName) {
        this.examClrName = examClrName == null ? null : examClrName.trim();
    }


    public String getExamSubName() {
        return examSubName;
    }


    public void setExamSubName(String examSubName) {
        this.examSubName = examSubName == null ? null : examSubName.trim();
    }

    public Integer getExaeYear(){return exaeYear;}

    public void setExaeYear(Integer exaeYear){
        this.exaeYear = exaeYear;
    }
}