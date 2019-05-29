package com.cmdbms.mapper;

import com.cmdbms.model.Teaarrange;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface TeaarrangeMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_tea_arrange
     *
     * @mbg.generated Mon May 13 10:24:04 CST 2019
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_tea_arrange
     *
     * @mbg.generated Mon May 13 10:24:04 CST 2019
     */
    int insert(Teaarrange record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_tea_arrange
     *
     * @mbg.generated Mon May 13 10:24:04 CST 2019
     */
    Teaarrange selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_tea_arrange
     *
     * @mbg.generated Mon May 13 10:24:04 CST 2019
     */
    List<Teaarrange> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_tea_arrange
     *
     * @mbg.generated Mon May 13 10:24:04 CST 2019
     */
    int updateByPrimaryKey(Teaarrange record);


    /*查询教师姓名，课程名字，上课时间，上课教室，上课日期*/
    String selectTeaNameById(int id);
    String selectClassNameById(int id);

    int selectTeaIdById(int id);
    int selectClassIdById(int id);
}