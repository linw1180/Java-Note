package com.luis.note.synchronizedexam.exam3;

/**
 * @Author: Luis
 * @date: 2022/1/13 9:48
 * @description:
 */
public class MyThread extends Thread{
    private MyClass myClass;

    public MyThread() {
    }

    public MyThread(MyClass myClass) {
        this.myClass = myClass;
    }

    @Override
    public void run() {
        if (Thread.currentThread().getName().equals("t1")) {
            myClass.doSome();
        }
        if (Thread.currentThread().getName().equals("t2")) {
            myClass.doOther();
        }
    }
}
