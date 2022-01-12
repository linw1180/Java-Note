package com.luis.note;

/**
 * @Author: Luis
 * @date: 2022/1/12 23:08
 * @description: 合理终止线程的方式：打布尔标记（重点）
 */
public class StopThread {
    public static void main(String[] args) {

        RunnableImpl r = new RunnableImpl(); // 此处需要单独创建出来，方便后续布尔标记属性的修改
        Thread t = new Thread(r);
        t.start(); // 启动分支线程
        try {
            Thread.sleep(1000 * 5); // 睡眠5秒
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        // 通过控制属性，终止线程
        r.run = false; // run是Runnable接口实现类中属性，需要Runnable接口实现类进行调用
    }
}

class RunnableImpl implements Runnable{

    boolean run = true; // 打布尔标记，控制线程的终止

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            if (run) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("--------------> " + i);
            } else {
                // 此处做终止线程前的最后处理
                return;
            }
        }
    }
}



