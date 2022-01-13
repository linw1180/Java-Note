package com.luis.note.threewayforthread.third;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * @Author: Luis
 * @date: 2022/1/13 20:06
 * @description:
 * 实现多线程的第三种方式：创建 “未来任务类” FutureTask 对象，在其构造方法中传入 Callable 接口实现类，
 * 最后，将 FutureTask 对象传入到新建的 Thread 类构造方法中即可
 * 注意：Callable 接口实现类中实现的 call() 类似于 run()，都是 JVM 自动调用
 * 优点：此方式创建的线程可以获取到线程的执行结果
 * 缺点：在获取该线程执行结果的时候，其他线程会受阻塞，效率较低
 */
public class Test {
    public static void main(String[] args) throws ExecutionException, InterruptedException {

        FutureTask task = new FutureTask(new CallableImpl());
        Thread t = new Thread(task);
        t.setName("t");
        t.start();

        // 调用 FutureTask 的 get() 方法获取线程返回值
        Object o = task.get();
        System.out.println("t线程返回值为：" + o);

        System.out.println("获取t线程执行结果时，此主线程会受到阻塞");
    }
}
