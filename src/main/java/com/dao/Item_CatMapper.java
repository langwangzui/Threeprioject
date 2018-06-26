package com.dao;

import com.pojo.Item_Cat;

public interface Item_CatMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Item_Cat record);

    int insertSelective(Item_Cat record);

    Item_Cat selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Item_Cat record);

    int updateByPrimaryKey(Item_Cat record);
}