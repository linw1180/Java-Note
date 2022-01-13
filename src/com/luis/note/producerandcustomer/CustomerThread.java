package com.luis.note.producerandcustomer;

import java.util.List;

/**
 * @Author: Luis
 * @date: 2022/1/13 22:07
 * @description: 模拟消费者
 */
public class CustomerThread implements Runnable {
    List list;

    public CustomerThread(List list) {
        this.list = list;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(1000); // 间隔一秒进行生产或消费
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        while (true) {
            synchronized (list) {
                if (list.size() == 0) { // 仓库中没东西，不再消费
                    try {
                        list.wait(); // 当前线程等待，归还list对象锁
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println("消费：" + list.get(0));
                list.remove(0); // 模拟消费
                list.notifyAll(); // 唤醒list对象上所有线程
            }
        }
    }
}
