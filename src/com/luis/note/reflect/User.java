package com.luis.note.reflect;

/**
 * @Author: Luis
 * @date: 2022/1/14 10:59
 * @description: 测试用用户类
 */
public class User {
    private String username;
    private int age;
    private boolean sex;

    public User() {
    }

    public User(String username, int age, boolean sex) {
        this.username = username;
        this.age = age;
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", age=" + age +
                ", sex=" + sex +
                '}';
    }
}
