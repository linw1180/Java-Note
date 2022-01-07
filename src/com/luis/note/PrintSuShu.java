package com.luis.note;

/**
 * @Author: Luis
 * @date: 2022/1/6 18:48
 * @description: 打印 1~100 所有素数，并按照每 5 个进行换行
 */
public class PrintSuShu {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 2; i <= 100; i++) {
            // 打标记
            boolean isSuShu = true;
            // 进行素数筛选
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isSuShu = false;
                    break;
                }
            }
            if (isSuShu) {
                count++;
                System.out.print(i + " ");
                // 换行控制
                if (count % 5 == 0) {
                    System.out.println();
                }
            }
        }
    }
}
