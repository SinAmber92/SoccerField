package com.soccerfield.dao;

import com.soccerfield.entity.Stadium;
import com.soccerfield.entity.StadiumExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StadiumMapper {
    long countByExample(StadiumExample example);

    int deleteByExample(StadiumExample example);

    int deleteByPrimaryKey(Integer staid);

    int insert(Stadium record);

    int insertSelective(Stadium record);

    List<Stadium> selectByExample(StadiumExample example);

    Stadium selectByPrimaryKey(Integer staid);

    int updateByExampleSelective(@Param("record") Stadium record, @Param("example") StadiumExample example);

    int updateByExample(@Param("record") Stadium record, @Param("example") StadiumExample example);

    int updateByPrimaryKeySelective(Stadium record);

    int updateByPrimaryKey(Stadium record);
}