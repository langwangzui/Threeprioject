package com.dao;

import com.pojo.Content_Category;

public interface Content_CategoryMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Content_Category record);

    int insertSelective(Content_Category record);

    Content_Category selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Content_Category record);

    int updateByPrimaryKey(Content_Category record);
}