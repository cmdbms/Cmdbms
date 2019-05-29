package com.cmdbms.model;

public class Stock {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_stock.stockId
     *
     * @mbg.generated Wed May 29 11:15:17 CST 2019
     */
    private Integer stockId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_stock.stockEquipment
     *
     * @mbg.generated Wed May 29 11:15:17 CST 2019
     */
    private String stockEquipment;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_stock.stockProName
     *
     * @mbg.generated Wed May 29 11:15:17 CST 2019
     */
    private String stockProName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_stock.stockAmount
     *
     * @mbg.generated Wed May 29 11:15:17 CST 2019
     */
    private Integer stockAmount;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_stock.stockShelf
     *
     * @mbg.generated Wed May 29 11:15:17 CST 2019
     */
    private String stockShelf;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_stock
     *
     * @mbg.generated Wed May 29 11:15:17 CST 2019
     */
    public Stock(Integer stockId, String stockEquipment, String stockProName, Integer stockAmount, String stockShelf) {
        this.stockId = stockId;
        this.stockEquipment = stockEquipment;
        this.stockProName = stockProName;
        this.stockAmount = stockAmount;
        this.stockShelf = stockShelf;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_stock
     *
     * @mbg.generated Wed May 29 11:15:17 CST 2019
     */
    public Stock() {
        super();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_stock.stockId
     *
     * @return the value of t_stock.stockId
     *
     * @mbg.generated Wed May 29 11:15:17 CST 2019
     */
    public Integer getStockId() {
        return stockId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_stock.stockId
     *
     * @param stockId the value for t_stock.stockId
     *
     * @mbg.generated Wed May 29 11:15:17 CST 2019
     */
    public void setStockId(Integer stockId) {
        this.stockId = stockId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_stock.stockEquipment
     *
     * @return the value of t_stock.stockEquipment
     *
     * @mbg.generated Wed May 29 11:15:17 CST 2019
     */
    public String getStockEquipment() {
        return stockEquipment;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_stock.stockEquipment
     *
     * @param stockEquipment the value for t_stock.stockEquipment
     *
     * @mbg.generated Wed May 29 11:15:17 CST 2019
     */
    public void setStockEquipment(String stockEquipment) {
        this.stockEquipment = stockEquipment == null ? null : stockEquipment.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_stock.stockProName
     *
     * @return the value of t_stock.stockProName
     *
     * @mbg.generated Wed May 29 11:15:17 CST 2019
     */
    public String getStockProName() {
        return stockProName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_stock.stockProName
     *
     * @param stockProName the value for t_stock.stockProName
     *
     * @mbg.generated Wed May 29 11:15:17 CST 2019
     */
    public void setStockProName(String stockProName) {
        this.stockProName = stockProName == null ? null : stockProName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_stock.stockAmount
     *
     * @return the value of t_stock.stockAmount
     *
     * @mbg.generated Wed May 29 11:15:17 CST 2019
     */
    public Integer getStockAmount() {
        return stockAmount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_stock.stockAmount
     *
     * @param stockAmount the value for t_stock.stockAmount
     *
     * @mbg.generated Wed May 29 11:15:17 CST 2019
     */
    public void setStockAmount(Integer stockAmount) {
        this.stockAmount = stockAmount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_stock.stockShelf
     *
     * @return the value of t_stock.stockShelf
     *
     * @mbg.generated Wed May 29 11:15:17 CST 2019
     */
    public String getStockShelf() {
        return stockShelf;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_stock.stockShelf
     *
     * @param stockShelf the value for t_stock.stockShelf
     *
     * @mbg.generated Wed May 29 11:15:17 CST 2019
     */
    public void setStockShelf(String stockShelf) {
        this.stockShelf = stockShelf == null ? null : stockShelf.trim();
    }
}