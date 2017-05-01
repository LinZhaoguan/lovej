package com.lovej.Entity;

/**
 * Created with IntelliJ IDEA.
 * User: Linzhaoguan
 * Date: 2017/5/1
 * Time: 22:47
 */
public class Demo {

    private Integer id;
    private String name;
    private String age;

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

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
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
