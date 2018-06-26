package com.controller;

import com.dao.InfoMapper;
import com.pojo.Info;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class InfoController {

    @Autowired
    InfoMapper infoMapper;


    @RequestMapping("/info/{id}")
    public Info selectByPrimaryKey(@PathVariable("id") Integer id){
        return  infoMapper.getInfoById(id);
    }
}
