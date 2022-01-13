package com.luis.note.synchronizedexam.exam4;

/**
 * @Author: Luis
 * @date: 2022/1/13 9:49
 * @description:
 */
public class MyClass {

    public synchronized static void doSome() {
        System.out.println("doSome begin");
        try {
            Thread.sleep(1000 * 10); // 当前线程睡眠10秒
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("doSome end");
    }

    public synchronized static void doOther() {
        System.out.println("doOther begin");
        System.out.println("doOther end");
    }
}
