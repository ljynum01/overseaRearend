package com.example.mapper;

import com.example.model.Type;
import com.example.model.TypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface TypeMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table type
     *
     * @mbg.generated Fri Jan 06 22:29:42 CST 2023
     */
    long countByExample(TypeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table type
     *
     * @mbg.generated Fri Jan 06 22:29:42 CST 2023
     */
    int deleteByExample(TypeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table type
     *
     * @mbg.generated Fri Jan 06 22:29:42 CST 2023
     */
    int deleteByPrimaryKey(Integer lid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table type
     *
     * @mbg.generated Fri Jan 06 22:29:42 CST 2023
     */
    int insert(Type record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table type
     *
     * @mbg.generated Fri Jan 06 22:29:42 CST 2023
     */
    int insertSelective(Type record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table type
     *
     * @mbg.generated Fri Jan 06 22:29:42 CST 2023
     */
    List<Type> selectByExampleWithRowbounds(TypeExample example, RowBounds rowBounds);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table type
     *
     * @mbg.generated Fri Jan 06 22:29:42 CST 2023
     */
    List<Type> selectByExample(TypeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table type
     *
     * @mbg.generated Fri Jan 06 22:29:42 CST 2023
     */
    Type selectByPrimaryKey(Integer lid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table type
     *
     * @mbg.generated Fri Jan 06 22:29:42 CST 2023
     */
    int updateByExampleSelective(@Param("record") Type record, @Param("example") TypeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table type
     *
     * @mbg.generated Fri Jan 06 22:29:42 CST 2023
     */
    int updateByExample(@Param("record") Type record, @Param("example") TypeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table type
     *
     * @mbg.generated Fri Jan 06 22:29:42 CST 2023
     */
    int updateByPrimaryKeySelective(Type record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table type
     *
     * @mbg.generated Fri Jan 06 22:29:42 CST 2023
     */
    int updateByPrimaryKey(Type record);
}