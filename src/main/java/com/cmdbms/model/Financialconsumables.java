package com.cmdbms.model;

import java.util.Date;

public class Financialconsumables {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_financial_consumables.matId
     *
     * @mbg.generated Wed May 29 11:15:17 CST 2019
     */
    private Integer matId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_financial_consumables.matName
     *
     * @mbg.generated Wed May 29 11:15:17 CST 2019
     */
    private String matName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_financial_consumables.matNumber
     *
     * @mbg.generated Wed May 29 11:15:17 CST 2019
     */
    private String matNumber;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_financial_consumables.matStartTime
     *
     * @mbg.generated Wed May 29 11:15:17 CST 2019
     */
    private Date matStartTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_financial_consumables.matEndTime
     *
     * @mbg.generated Wed May 29 11:15:17 CST 2019
     */
    private Date matEndTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_financial_consumables.matLossMoney
     *
     * @mbg.generated Wed May 29 11:15:17 CST 2019
     */
    private String matLossMoney;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_financial_consumables
     *
     * @mbg.generated Wed May 29 11:15:17 CST 2019
     */
    public Financialconsumables(Integer matId, String matName, String matNumber, Date matStartTime, Date matEndTime, String matLossMoney) {
        this.matId = matId;
        this.matName = matName;
        this.matNumber = matNumber;
        this.matStartTime = matStartTime;
        this.matEndTime = matEndTime;
        this.matLossMoney = matLossMoney;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_financial_consumables
     *
     * @mbg.generated Wed May 29 11:15:17 CST 2019
     */
    public Financialconsumables() {
        super();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_financial_consumables.matId
     *
     * @return the value of t_financial_consumables.matId
     *
     * @mbg.generated Wed May 29 11:15:17 CST 2019
     */
    public Integer getMatId() {
        return matId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_financial_consumables.matId
     *
     * @param matId the value for t_financial_consumables.matId
     *
     * @mbg.generated Wed May 29 11:15:17 CST 2019
     */
    public void setMatId(Integer matId) {
        this.matId = matId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_financial_consumables.matName
     *
     * @return the value of t_financial_consumables.matName
     *
     * @mbg.generated Wed May 29 11:15:17 CST 2019
     */
    public String getMatName() {
        return matName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_financial_consumables.matName
     *
     * @param matName the value for t_financial_consumables.matName
     *
     * @mbg.generated Wed May 29 11:15:17 CST 2019
     */
    public void setMatName(String matName) {
        this.matName = matName == null ? null : matName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_financial_consumables.matNumber
     *
     * @return the value of t_financial_consumables.matNumber
     *
     * @mbg.generated Wed May 29 11:15:17 CST 2019
     */
    public String getMatNumber() {
        return matNumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_financial_consumables.matNumber
     *
     * @param matNumber the value for t_financial_consumables.matNumber
     *
     * @mbg.generated Wed May 29 11:15:17 CST 2019
     */
    public void setMatNumber(String matNumber) {
        this.matNumber = matNumber == null ? null : matNumber.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_financial_consumables.matStartTime
     *
     * @return the value of t_financial_consumables.matStartTime
     *
     * @mbg.generated Wed May 29 11:15:17 CST 2019
     */
    public Date getMatStartTime() {
        return matStartTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_financial_consumables.matStartTime
     *
     * @param matStartTime the value for t_financial_consumables.matStartTime
     *
     * @mbg.generated Wed May 29 11:15:17 CST 2019
     */
    public void setMatStartTime(Date matStartTime) {
        this.matStartTime = matStartTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_financial_consumables.matEndTime
     *
     * @return the value of t_financial_consumables.matEndTime
     *
     * @mbg.generated Wed May 29 11:15:17 CST 2019
     */
    public Date getMatEndTime() {
        return matEndTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_financial_consumables.matEndTime
     *
     * @param matEndTime the value for t_financial_consumables.matEndTime
     *
     * @mbg.generated Wed May 29 11:15:17 CST 2019
     */
    public void setMatEndTime(Date matEndTime) {
        this.matEndTime = matEndTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_financial_consumables.matLossMoney
     *
     * @return the value of t_financial_consumables.matLossMoney
     *
     * @mbg.generated Wed May 29 11:15:17 CST 2019
     */
    public String getMatLossMoney() {
        return matLossMoney;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_financial_consumables.matLossMoney
     *
     * @param matLossMoney the value for t_financial_consumables.matLossMoney
     *
     * @mbg.generated Wed May 29 11:15:17 CST 2019
     */
    public void setMatLossMoney(String matLossMoney) {
        this.matLossMoney = matLossMoney == null ? null : matLossMoney.trim();
    }
}