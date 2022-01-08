package com.luis.note.hotel;

import java.util.Scanner;

/**
 * @Author: Luis
 * @date: 2022/1/8
 * @description: 二维数组实现简易订房系统
 */
public class HotelSystem {
    public static void main(String[] args) {

        Hotel hotel = new Hotel();

        System.out.println("欢迎使用酒店订房系统！");
        System.out.println("功能编号：[1]查看订房信息 [2]订房 [3]退房 [4]退出系统");
        Scanner s = new Scanner(System.in);

        while (true) {
            System.out.print("请输入的功能编号：");
            int no = s.nextInt();
            if (no == 1) {
                hotel.print();
            } else if (no == 2) {
                System.out.print("请输入订房编号：");
                int roomNo = s.nextInt();
                hotel.order(roomNo);
            } else if (no == 3) {
                System.out.print("请输入退房编号：");
                int roomNo = s.nextInt();
                hotel.exit(roomNo);
            } else if (no == 4) {
                System.out.println("系统已退出，欢迎下次使用");
                return;
            } else {
                System.out.println("输入错误，请重新输入");
            }
        }
    }
}
