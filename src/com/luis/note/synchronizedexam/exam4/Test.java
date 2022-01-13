package com.luis.note.synchronizedexam.exam4;

/**
 * @Author: Luis
 * @date: 2022/1/13 9:57
 * @description:
 *
 * 面试题：doOther()的执行需要等doSome()结束吗？
 *      需要，synchronized出现在静态方法上是类锁，不管对象创建了几个，类锁只有一把，需要线程排队
 */
public class Test {
    public static void main(String[] args) {

        MyClass mc1 = new MyClass();
        MyClass mc2 = new MyClass();
        MyThread t1 = new MyThread(mc1);
        MyThread t2 = new MyThread(mc2);

        t1.setName("t1");
        t2.setName("t2");

        t1.start();
        try {
            Thread.sleep(1000); // 此处睡眠1秒是为了保证t1线程先执行
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        t2.start();
    }
}
