package com.luis.note;

import java.util.Arrays;
import java.util.Objects;

/**
 * @Author: Luis
 * @date: 2022/1/8 18:28
 * @description: 使用一维数组模拟压栈弹栈
 */
public class MyStack {
    private Object[] obj;
    private int index;

    public void push(Object o) {
        if (index >= obj.length - 1) {
            System.out.println("栈已满，压栈失败，栈帧指向：" + index);
            return;
        }
        obj[++index] = o;
        System.out.println("========> push " + o + " " + index);
    }

    public void pop() {
        if (index < 0) {
            System.out.println("栈已空，弹栈失败,栈帧指向：" + index);
            return;
        }
        System.out.println("========> pop " + obj[index] + " " + index);
        obj[index--] = null;
    }

    public MyStack() {
        obj = new Object[10];
        index = -1;
    }

    public MyStack(Object[] obj, int index) {
        this.obj = obj;
        this.index = index;
    }

    public Object[] getObj() {
        return obj;
    }

    public void setObj(Object[] obj) {
        this.obj = obj;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyStack myStack = (MyStack) o;
        return index == myStack.index && Arrays.equals(obj, myStack.obj);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(index);
        result = 31 * result + Arrays.hashCode(obj);
        return result;
    }

    @Override
    public String toString() {
        return "MyStack{" +
                "obj=" + Arrays.toString(obj) +
                ", index=" + index +
                '}';
    }

    //region 测试用
    public static void main(String[] args) {

        MyStack myStack = new MyStack();

        myStack.push(new Object());
        myStack.push(new Object());
        myStack.push(new Object());
        myStack.push(new Object());
        myStack.push(new Object());
        myStack.push(new Object());
        myStack.push(new Object());
        myStack.push(new Object());
        myStack.push(new Object());
        myStack.push(new Object());
        myStack.push(new Object());

        myStack.pop();
        myStack.pop();
        myStack.pop();
        myStack.pop();
        myStack.pop();
        myStack.pop();
        myStack.pop();
        myStack.pop();
        myStack.pop();
        myStack.pop();
        myStack.pop();
        Object[] o = myStack.getObj();
        for (int i = 0; i < o.length; i++) {
            System.out.print(o[i] + " ");
        }
    }
    //endregion
}
