package com.luis.note.threadsafe2;

/**
 * @Author: Luis
 * @date: 2022/1/13 8:53
 * @description: 测试类
 * 结果：使用synchronized控制代码实现线程排队执行，解决线程安全问题（线程同步机制）
 * tips：此处synchronized有两种用法，一种是使用同步语句块，一种是直接在方法上加synchronized关键字，此时默认共享对象为this
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
