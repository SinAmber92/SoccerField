package com.soccerfield.dao;

import com.soccerfield.entity.Orderlist;
import com.soccerfield.entity.OrderlistExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrderlistMapper {
    long countByExample(OrderlistExample example);

    int deleteByExample(OrderlistExample example);

    int deleteByPrimaryKey(Integer orderid);

    int insert(Orderlist record);

    int insertSelective(Orderlist record);

    List<Orderlist> selectByExample(OrderlistExample example);

    Orderlist selectByPrimaryKey(Integer orderid);

    int updateByExampleSelective(@Param("record") Orderlist record, @Param("example") OrderlistExample example);

    int updateByExample(@Param("record") Orderlist record, @Param("example") OrderlistExample example);

    int updateByPrimaryKeySelective(Orderlist record);

    int updateByPrimaryKey(Orderlist record);

	List<Orderlist> selectByAreaidAndDate(int areaid, String date);
}