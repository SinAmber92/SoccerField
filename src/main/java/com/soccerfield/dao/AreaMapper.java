package com.soccerfield.dao;

import com.soccerfield.entity.Area;
import com.soccerfield.entity.AreaExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AreaMapper {
    long countByExample(AreaExample example);

    int deleteByExample(AreaExample example);

    int deleteByPrimaryKey(Integer areaid);

    int insert(Area record);

    int insertSelective(Area record);

    List<Area> selectByExample(AreaExample example);

    Area selectByPrimaryKey(Integer areaid);

    int updateByExampleSelective(@Param("record") Area record, @Param("example") AreaExample example);

    int updateByExample(@Param("record") Area record, @Param("example") AreaExample example);

    int updateByPrimaryKeySelective(Area record);

    int updateByPrimaryKey(Area record);
}