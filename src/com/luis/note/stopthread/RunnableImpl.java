package com.luis.note.stopthread;

/**
 * @Author: Luis
 * @date: 2022/1/13 9:30
 * @description:
 */
class RunnableImpl implements Runnable {

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
