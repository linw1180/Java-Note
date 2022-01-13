package com.luis.note.threewayforthread.second;

/**
 * @Author: Luis
 * @date: 2022/1/13 19:59
 * @description:
 * 实现多线程的第二种方式：实现 Runnable 接口，将该接口实现类传入到创建的 Thread 类构造方法中即可
 * 优点：不占用继承位置，还可继承其他类，扩展性较第一种继承方式好
 */
public class Test {
    public static void main(String[] args) {

        Thread t = new Thread(new RunnableImpl()); // 此处构造方法中可使用匿名内部类方式创建类对象
        t.setName("t");
        t.start();

        System.out.println(Thread.currentThread().getName() + "线程执行");
    }
}
