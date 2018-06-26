package com.dao;

import com.pojo.Item_Param_Item;

public interface Item_Param_ItemMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Item_Param_Item record);

    int insertSelective(Item_Param_Item record);

    Item_Param_Item selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Item_Param_Item record);

    int updateByPrimaryKeyWithBLOBs(Item_Param_Item record);

    int updateByPrimaryKey(Item_Param_Item record);
}