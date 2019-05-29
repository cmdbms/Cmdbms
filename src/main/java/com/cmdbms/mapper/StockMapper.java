package com.cmdbms.mapper;

import com.cmdbms.model.Stock;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StockMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_stock
     *
     * @mbg.generated Wed May 29 11:15:17 CST 2019
     */
    int deleteByPrimaryKey(Integer stockId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_stock
     *
     * @mbg.generated Wed May 29 11:15:17 CST 2019
     */
    int insert(Stock record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_stock
     *
     * @mbg.generated Wed May 29 11:15:17 CST 2019
     */
    List<Stock> selectByPrimaryKey(@Param(value = "stockEquipment")String stockEquipment);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_stock
     *
     * @mbg.generated Wed May 29 11:15:17 CST 2019
     */
    List<Stock> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_stock
     *
     * @mbg.generated Wed May 29 11:15:17 CST 2019
     */
    int updateByPrimaryKey(Stock record);
}