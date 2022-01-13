package com.luis.note.threewayforthread.third;

import java.util.concurrent.Callable;

/**
 * @Author: Luis
 * @date: 2022/1/13 20:16
 * @description:
 */
public class CallableImpl implements Callable {
    @Override
    public Object call() throws Exception {
        System.out.println(Thread.currentThread().getName() + "线程 begin");
        Thread.sleep(1000 * 10);
        System.out.println(Thread.currentThread().getName() + "线程 end");
        return null;
    }
}
