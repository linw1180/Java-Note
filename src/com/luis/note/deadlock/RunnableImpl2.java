package com.luis.note.deadlock;

/**
 * @Author: Luis
 * @date: 2022/1/13 10:48
 * @description:
 */
public class RunnableImpl2 implements Runnable{
    Object o1;
    Object o2;

    public RunnableImpl2(Object o1, Object o2) {
        this.o1 = o1;
        this.o2 = o2;
    }

    @Override
    public void run() {
        synchronized (o2) {
            //region 睡眠1秒，让t1百分百锁住o1
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            //endregion
            synchronized (o1) { // 由于t1锁住o1，t2在这里拿不到o1，所以僵持在这里
                System.out.println("这里可能永远也执行不到");
            }
        }
    }
}
