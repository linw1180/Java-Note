package com.luis.note;

/**
 * @Author: Luis
 * @date: 2021/11/2 22:50
 * @description: 冒泡排序
 */
public class BubbleSort {
    public static void main(String[] args) {
        /*
            冒泡排序原理：进行多次排序，每次排序完，将最大值放到最右边
            每次排序方法：将前一个数和后一个数进行比较，前数大于后数，则交换位置，每次都能将最大值放到最右边
            ps：
                每次放到最右边的最大值不参与下次比较
                此写法仅作示例，还有很多可优化地方
                找规律，不要硬背！
         */
        int[] arr = {4, 1, 6, 2, 3, 7, 0};
        // 7 个数，需要进行 6 次排序
        int temp;
        for (int i = 0; i < arr.length - 1; i++) {
            // 第 1 次排序：比较 6 次
            // 第 2 次排序：比较 5 次
            // 第 3 次排序：比较 4 次
            // 以此类推...
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        // 遍历排序后的数组
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
    }
}
