package com.controller;

import com.dao.InfoMapper;
import com.pojo.Info;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


@Controller
public class InfoController {

    @Autowired
    InfoMapper infoMapper;



    @ResponseBody
    @GetMapping("/info/{id}")
    public Info getInfoById(@PathVariable("id") Integer id){
        return  infoMapper.getInfoById(id);
    }

    @ResponseBody
    @GetMapping("/in")
    public String show(){
        return "hello Idea";
    }
}
