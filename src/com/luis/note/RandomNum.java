package com.luis.note;

import java.util.Random;

/**
 * @Author: Luis
 * @date: 2022/1/9 22:13
 * @description: 随机数练习
 * 要求：从 0-100 中生成 5 个不重复的随机数，并将其存放在数组中
 * tip: 注意培养方法的封装思想
 */
public class RandomNum {
    public static void main(String[] args) {

        Random random = new Random();
        int[] arr = new int[5];
        // 将动态初始化的数组中默认元素 0 全修改为 -1，避免与后续要生成的随机数有冲突
        for (int i = 0; i < arr.length; i++) {
            arr[i] = -1;
        }
        int index = 0; // 控制循环的初始变量（同时作为数组下标控制随机数的数组录入）
        while (index < arr.length) {
            int num = random.nextInt(11); // 传入的 11，生成 0-10 之间的随机数，不包括 11
            if (!ifContains(arr, num)) { // 如果 arr 数组中不存在 num，则将其录入【练习重点：方法封装】
                arr[index++] = num; // 将生成的随机数录入数组，并且 index 下标进行 +1，便于下次随机数的继续录入
            }
        }
        // 遍历数组看结果
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    /**
     * 判断某 int 类型元素是否存在于某 int 数组中
     * @param arr 目标 int 数组
     * @param dest 待查找的 int 元素
     * @return true 存在，false 不存在
     */
    public static boolean ifContains(int[] arr, int dest) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == dest) {
                return true;
            }
        }
        return false;
    }
}
