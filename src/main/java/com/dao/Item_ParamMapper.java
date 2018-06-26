package com.dao;

import com.pojo.Item_Param;

public interface Item_ParamMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Item_Param record);

    int insertSelective(Item_Param record);

    Item_Param selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Item_Param record);

    int updateByPrimaryKeyWithBLOBs(Item_Param record);

    int updateByPrimaryKey(Item_Param record);
}