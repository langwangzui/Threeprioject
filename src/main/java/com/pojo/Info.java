package com.pojo;


import org.springframework.boot.autoconfigure.domain.EntityScan;

/*import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

//使用JPA注解配置映射关系
@Entity //告诉JPA这是一个实体类（和数据表映射的类）*/
public class Info {

/*    @Id  //这是一个主键
    @GeneratedValue(strategy = GenerationType.IDENTITY)//自增主键*/
    private Integer id;

    private String name;

    private Integer age;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Info{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}