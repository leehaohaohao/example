package com.example.entity;

/**
 * 用户类
 *
 * @author lihao
 * &#064;date  2024/11/17--21:04
 * @since 1.0
 */
public class User {
    // 用户名
    private String name;
    // 年龄
    private Integer age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
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

    public void setAge(int age) {
        this.age = age;
    }
}
