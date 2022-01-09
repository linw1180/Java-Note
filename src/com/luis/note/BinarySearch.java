package com.luis.note;

/**
 * @Author: Luis
 * @date: 2022/1/9 9:27
 * @description: 二分法查找(在排序后的数组中对于指定元素的下标进行查找)
 */
public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 10}; // 排序后的数组
        int ele = 3; // 待查找的元素

        int begin = 0;
        int end = arr.length - 1;
        while (begin <= end) {
            int mid = (begin + end) / 2;
            if (arr[mid] > ele) {
                end = mid - 1;
            } else if (arr[mid] < ele) {
                begin = mid + 1;
            } else {
                System.out.println("元素" + ele + "的下标为：" + mid);
                return;
            }
        }
    }
}
