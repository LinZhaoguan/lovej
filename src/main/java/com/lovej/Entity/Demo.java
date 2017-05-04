package com.lovej.Entity;

import com.baomidou.mybatisplus.annotations.TableId;

import java.io.Serializable;

/**
 * Created with IntelliJ IDEA.
 * User: Linzhaoguan
 * Date: 2017/5/1
 * Time: 22:47
 */
public class Demo implements Serializable {

    private static final long serialVersionUID = 1L;

    private String redisKey;//redis中的key
    @TableId
    private Integer id;
    private String name;
    private Integer age;

    public String getRedisKey() {
        return redisKey;
    }

    public void setRedisKey(String redisKey) {
        this.redisKey = redisKey;
    }

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
        return "Demo{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age='" + age + '\'' +
                '}';
    }
}
