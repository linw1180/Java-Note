package com.luis.note;

/**
 * @Author: Luis
 * @date: 2022/1/14 6:50
 * @description:
 */
public class Test {
    public static void main(String[] args) throws ClassNotFoundException {
        m("1");
        m("a",1);
        m("a",1, 2);
        m("a",1, 2, 3);

    }

    public static void m(String s, int... args) {
        System.out.println("========> ");
    }
}
