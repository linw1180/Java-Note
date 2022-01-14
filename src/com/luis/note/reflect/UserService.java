package com.luis.note.reflect;

/**
 * @Author: Luis
 * @date: 2022/1/14 10:10
 * @description: 测试用用户服务类
 */
public class UserService {
    /**
     * 用户登录
     * @param username 用户名
     * @param password 密码
     */
    public void login(String username, String password) {
        if (username.equals("admin") && password.equals("123")) {
            System.out.println("登陆成功");
        } else{
            System.out.println("登陆失败");
        }
    }

    /**
     * 用户退出
     */
    public void logout() {
        System.out.println("退出系统");
    }
}
