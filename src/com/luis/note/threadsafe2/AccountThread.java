package com.luis.note.threadsafe2;

/**
 * @Author: Luis
 * @date: 2022/1/13 8:42
 * @description: 账户线程，模拟用户进行取钱操作
 */
public class AccountThread implements Runnable {
    private Account act;

    public AccountThread() {
    }

    public AccountThread(Account act) {
        this.act = act;
    }

    @Override
    public void run() {
        // 假设取款5000
        double money = 5000;
        act.withdraw(money);
        System.out.println(Thread.currentThread().getName() + " 对账户：" + act.getActno() + "取款" + money + "成功，余额为" + act.getBalance());
    }
}
