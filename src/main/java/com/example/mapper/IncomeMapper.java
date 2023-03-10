package com.example.mapper;

import com.example.model.Income;
import com.example.model.IncomeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface IncomeMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table income
     *
     * @mbg.generated Fri Jan 06 22:29:42 CST 2023
     */
    long countByExample(IncomeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table income
     *
     * @mbg.generated Fri Jan 06 22:29:42 CST 2023
     */
    int deleteByExample(IncomeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table income
     *
     * @mbg.generated Fri Jan 06 22:29:42 CST 2023
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table income
     *
     * @mbg.generated Fri Jan 06 22:29:42 CST 2023
     */
    int insert(Income record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table income
     *
     * @mbg.generated Fri Jan 06 22:29:42 CST 2023
     */
    int insertSelective(Income record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table income
     *
     * @mbg.generated Fri Jan 06 22:29:42 CST 2023
     */
    List<Income> selectByExampleWithRowbounds(IncomeExample example, RowBounds rowBounds);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table income
     *
     * @mbg.generated Fri Jan 06 22:29:42 CST 2023
     */
    List<Income> selectByExample(IncomeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table income
     *
     * @mbg.generated Fri Jan 06 22:29:42 CST 2023
     */
    Income selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table income
     *
     * @mbg.generated Fri Jan 06 22:29:42 CST 2023
     */
    int updateByExampleSelective(@Param("record") Income record, @Param("example") IncomeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table income
     *
     * @mbg.generated Fri Jan 06 22:29:42 CST 2023
     */
    int updateByExample(@Param("record") Income record, @Param("example") IncomeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table income
     *
     * @mbg.generated Fri Jan 06 22:29:42 CST 2023
     */
    int updateByPrimaryKeySelective(Income record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table income
     *
     * @mbg.generated Fri Jan 06 22:29:42 CST 2023
     */
    int updateByPrimaryKey(Income record);

//    Income findSum(Income income);
}