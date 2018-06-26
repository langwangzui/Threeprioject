package com.dao;

import com.pojo.Info;
import org.springframework.context.annotation.Bean;


//@Mapper或者@MapperScan将接口扫描装配到容器中
public interface InfoMapper {

    Info getInfoById(Integer id);

}