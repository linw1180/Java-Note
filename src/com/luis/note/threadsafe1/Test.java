package com.luis.note.threadsafe1;

/**
 * @Author: Luis
 * @date: 2022/1/13 8:53
 * @description: 测试类
 * 结果：线程同步发生线程安全问题
 */
public class Test {
    public static void main(String[] args) {

        // 创建一个银行账户类
        Account act = new Account("actno-1", 10000);

        // 创建两个接口实现类和两个线程对象
        AccountThread at1 = new AccountThread(act); // 两个线程共享一个账户对象
        AccountThread at2 = new AccountThread(act); // 两个线程共享一个账户对象
        Thread t1 = new Thread(at1);
        t1.setName("t1");
        Thread t2 = new Thread(at2);
        t2.setName("t2");

        // 启动两个线程，模拟取款操作
        t1.start();
        t2.start();
    }
}
