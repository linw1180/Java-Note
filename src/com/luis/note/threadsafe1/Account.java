package com.luis.note.threadsafe1;

import java.util.Objects;

/**
 * @Author: Luis
 * @date: 2022/1/13 8:35
 * @description: 账户类
 */
public class Account {
    private String actno;
    private double balance;

    // 取钱方法
    public void withdraw(double money) {
        double before = this.balance;
        double after = before - money;
        // 模拟网络延迟，百分百会发生线程安全
        // 前一个线程读到余额，余额还没更新，后一个线程抢先读余额并更新
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        this.setBalance(after);
    }

    public Account() {
    }

    public Account(String actno, double balance) {
        this.actno = actno;
        this.balance = balance;
    }

    public String getActno() {
        return actno;
    }

    public void setActno(String actno) {
        this.actno = actno;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Account account = (Account) o;
        return Double.compare(account.balance, balance) == 0 && Objects.equals(actno, account.actno);
    }

    @Override
    public int hashCode() {
        return Objects.hash(actno, balance);
    }

    @Override
    public String toString() {
        return "Account{" +
                "actno='" + actno + '\'' +
                ", balance=" + balance +
                '}';
    }
}
