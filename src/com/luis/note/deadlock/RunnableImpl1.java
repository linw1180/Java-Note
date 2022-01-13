package com.luis.note.deadlock;

/**
 * @Author: Luis
 * @date: 2022/1/13 10:48
 * @description:
 */
public class RunnableImpl1 implements Runnable{
    Object o1;
    Object o2;

    public RunnableImpl1(Object o1, Object o2) {
        this.o1 = o1;
        this.o2 = o2;
    }

    @Override
    public void run() {
        synchronized (o1) {
            //region 睡眠1秒，让t2百分百锁住o2
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            //endregion
            synchronized (o2) { // 由于t2锁住o2，t1在这里拿不到o2，所以僵持在这里
                System.out.println("这里可能永远也执行不到");
            }
        }
    }
}
