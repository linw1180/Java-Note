package com.luis.note.producerandcustomer;

import java.util.List;

/**
 * @Author: Luis
 * @date: 2022/1/13 21:59
 * @description: 模拟生产者
 */
public class ProducerThread implements Runnable {
    List list; // 共享数据，模拟仓库

    public ProducerThread(List list) {
        this.list = list;
    }

    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(1000); // 间隔一秒进行生产或消费
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized (list) {
                if (list.size() > 0) { // 仓库中有东西，不再生产
                    try {
                        list.wait(); // 让当前线程等待，并释放占有的list对象锁
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                Object o = new Object();
                System.out.println("生产：" + o);
                list.add(o); // 模拟生产
                list.notifyAll(); // 唤醒list对象上所有线程
            }
        }
    }
}
