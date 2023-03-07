package com.example.mapper;

import com.example.model.Area;
import com.example.model.AreaExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface AreaMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table area
     *
     * @mbg.generated Fri Jan 06 22:29:42 CST 2023
     */
    long countByExample(AreaExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table area
     *
     * @mbg.generated Fri Jan 06 22:29:42 CST 2023
     */
    int deleteByExample(AreaExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table area
     *
     * @mbg.generated Fri Jan 06 22:29:42 CST 2023
     */
    int deleteByPrimaryKey(Integer saddressid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table area
     *
     * @mbg.generated Fri Jan 06 22:29:42 CST 2023
     */
    int insert(Area record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table area
     *
     * @mbg.generated Fri Jan 06 22:29:42 CST 2023
     */
    int insertSelective(Area record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table area
     *
     * @mbg.generated Fri Jan 06 22:29:42 CST 2023
     */
    List<Area> selectByExampleWithRowbounds(AreaExample example, RowBounds rowBounds);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table area
     *
     * @mbg.generated Fri Jan 06 22:29:42 CST 2023
     */
    List<Area> selectByExample(AreaExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table area
     *
     * @mbg.generated Fri Jan 06 22:29:42 CST 2023
     */
    Area selectByPrimaryKey(Integer saddressid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table area
     *
     * @mbg.generated Fri Jan 06 22:29:42 CST 2023
     */
    int updateByExampleSelective(@Param("record") Area record, @Param("example") AreaExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table area
     *
     * @mbg.generated Fri Jan 06 22:29:42 CST 2023
     */
    int updateByExample(@Param("record") Area record, @Param("example") AreaExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table area
     *
     * @mbg.generated Fri Jan 06 22:29:42 CST 2023
     */
    int updateByPrimaryKeySelective(Area record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table area
     *
     * @mbg.generated Fri Jan 06 22:29:42 CST 2023
     */
    int updateByPrimaryKey(Area record);
}