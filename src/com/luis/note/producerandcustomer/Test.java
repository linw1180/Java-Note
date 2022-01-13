package com.luis.note.producerandcustomer;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: Luis
 * @date: 2022/1/13 21:46
 * @description: 生产者和消费者模式
 * 知识点：Object 对象的 wait() 和 notifyAll()
 * wait() 让当前线程对象处于等待状态，并释放占有的锁
 * notifyAll() 唤醒当前对象上所有的线程
 *
 * 代码模拟：工厂中生产和消费均衡，实现生产一个消费一个
 * 数组模拟仓库；两个线程，一个模拟消费，一个模拟生产
 */
public class Test {
    public static void main(String[] args) {

        List list = new ArrayList();
        Thread t1 = new Thread(new ProducerThread(list));
        Thread t2 = new Thread(new CustomerThread(list));
        t1.start();
        t2.start();
    }
}
