package com.dao;

import com.pojo.Order_Shipping;

public interface Order_ShippingMapper {
    int deleteByPrimaryKey(String orderId);

    int insert(Order_Shipping record);

    int insertSelective(Order_Shipping record);

    Order_Shipping selectByPrimaryKey(String orderId);

    int updateByPrimaryKeySelective(Order_Shipping record);

    int updateByPrimaryKey(Order_Shipping record);
}