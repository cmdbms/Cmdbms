package com.cmdbms.mapper;

import com.cmdbms.model.Staffmsg;
import java.util.List;

public interface StaffmsgMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_staff_msg
     *
     * @mbg.generated Wed May 29 11:15:17 CST 2019
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_staff_msg
     *
     * @mbg.generated Wed May 29 11:15:17 CST 2019
     */
    int insert(Staffmsg record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_staff_msg
     *
     * @mbg.generated Wed May 29 11:15:17 CST 2019
     */
    Staffmsg selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_staff_msg
     *
     * @mbg.generated Wed May 29 11:15:17 CST 2019
     */
    List<Staffmsg> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_staff_msg
     *
     * @mbg.generated Wed May 29 11:15:17 CST 2019
     */
    int updateByPrimaryKey(Staffmsg record);
}