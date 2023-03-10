package com.example.mapper;

import com.example.model.Image;
import com.example.model.ImageExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface ImageMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table image
     *
     * @mbg.generated Fri Jan 06 22:29:42 CST 2023
     */
    long countByExample(ImageExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table image
     *
     * @mbg.generated Fri Jan 06 22:29:42 CST 2023
     */
    int deleteByExample(ImageExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table image
     *
     * @mbg.generated Fri Jan 06 22:29:42 CST 2023
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table image
     *
     * @mbg.generated Fri Jan 06 22:29:42 CST 2023
     */
    int insert(Image record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table image
     *
     * @mbg.generated Fri Jan 06 22:29:42 CST 2023
     */
    int insertSelective(Image record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table image
     *
     * @mbg.generated Fri Jan 06 22:29:42 CST 2023
     */
    List<Image> selectByExampleWithRowbounds(ImageExample example, RowBounds rowBounds);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table image
     *
     * @mbg.generated Fri Jan 06 22:29:42 CST 2023
     */
    List<Image> selectByExample(ImageExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table image
     *
     * @mbg.generated Fri Jan 06 22:29:42 CST 2023
     */
    Image selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table image
     *
     * @mbg.generated Fri Jan 06 22:29:42 CST 2023
     */
    int updateByExampleSelective(@Param("record") Image record, @Param("example") ImageExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table image
     *
     * @mbg.generated Fri Jan 06 22:29:42 CST 2023
     */
    int updateByExample(@Param("record") Image record, @Param("example") ImageExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table image
     *
     * @mbg.generated Fri Jan 06 22:29:42 CST 2023
     */
    int updateByPrimaryKeySelective(Image record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table image
     *
     * @mbg.generated Fri Jan 06 22:29:42 CST 2023
     */
    int updateByPrimaryKey(Image record);

    int updateImage(Image record);
}