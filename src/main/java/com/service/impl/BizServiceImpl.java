package com.service.impl;

import com.dao.InfoMapper;
import com.pojo.Info;
import com.service.BizService;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;


@Service
public class BizServiceImpl implements BizService{

    @Autowired
    private InfoMapper infomapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return 0;
    }

    @Override
    public int insert(Info record) {
        return 0;
    }

    @Override
    public int insertSelective(Info record) {
        return 0;
    }

    @Override
    public Info selectByPrimaryKey(Integer id) {
        return infomapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(Info record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(Info record) {
        return 0;
    }
}
