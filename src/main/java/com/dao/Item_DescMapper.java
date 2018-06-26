package com.dao;

import com.pojo.Item_Desc;

public interface Item_DescMapper {
    int deleteByPrimaryKey(Long itemId);

    int insert(Item_Desc record);

    int insertSelective(Item_Desc record);

    Item_Desc selectByPrimaryKey(Long itemId);

    int updateByPrimaryKeySelective(Item_Desc record);

    int updateByPrimaryKeyWithBLOBs(Item_Desc record);

    int updateByPrimaryKey(Item_Desc record);
}