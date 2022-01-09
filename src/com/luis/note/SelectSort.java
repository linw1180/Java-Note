package com.luis.note;

/**
 * @Author: Luis
 * @date: 2022/1/9 7:49
 * @description: 选择排序
 *  每次循环，将最小的放在最前面，相对冒泡，交换次数少了，而且每次交换都有意义
 */
public class SelectSort {
    public static void main(String[] args) {

        int[] arr = {3, 7, 6, 2, 5};
        for (int i = 0; i < arr.length - 1; i++) { // 外循环四次
            int min = i; // 假设最前的元素是最小值（下标处理）
            for (int j = i + 1; j < arr.length; j++) { // 此处 j = i + 1 是重点，巧妙的数组下标设置，利于进行比较
                if (arr[j] < arr[min]) { // 将后面所有的元素和假设的第一个即最小元素进行比较
                    min = j; // 如果有比假设的最小元素还小的，将其下标赋给假设的最小元素，进行更新
                }
            }
            if (min != i) { // 如果 min 不是原假定的那个 i， 说明比较中出现了比假定的更小的，则需要交换位置
                int temp = arr[min];
                arr[min] = arr[i];
                arr[i] = temp;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
