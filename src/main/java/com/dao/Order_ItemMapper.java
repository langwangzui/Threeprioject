package com.dao;

import com.pojo.Order_Item;

public interface Order_ItemMapper {
    int deleteByPrimaryKey(String id);

    int insert(Order_Item record);

    int insertSelective(Order_Item record);

    Order_Item selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(Order_Item record);

    int updateByPrimaryKey(Order_Item record);
}