package com.luis.note.hotel;

import java.util.Arrays;

/**
 * @Author: Luis
 * @date: 2022/1/8 22:23
 * @description: 酒店类
 */
public class Hotel {
    private Room[][] rooms;

    public Hotel() {
        rooms = new Room[3][10];
        for (int i = 0; i < rooms.length; i++) {
            for (int j = 0; j < rooms[i].length; j++) {

                if (i == 0) {
                    rooms[i][j] = new Room((i + 1) * 100 + j + 1, "单人间", true);
                } else if (i == 1) {
                    rooms[i][j] = new Room((i + 1) * 100 + j + 1, "标准间", true);
                } else if (i == 2) {
                    rooms[i][j] = new Room((i + 1) * 100 + j + 1, "豪华间", true);
                }
            }
        }
    }

    public void print() {
        for (int i = 0; i < rooms.length; i++) {
            for (int j = 0; j < rooms[i].length; j++) {
                System.out.print(rooms[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void order(int roomNo) {
        // TODO: 2022/1/8 订房编号异常处理
        rooms[(roomNo / 100) - 1][(roomNo % 100) - 1].setStatus(false);
        System.out.println(roomNo + "订房成功");
    }

    public void exit(int roomNo) {
        // TODO: 2022/1/8 退房编号异常处理 
        rooms[(roomNo / 100) - 1][(roomNo % 100) - 1].setStatus(true);
        System.out.println(roomNo + "退房成功");
    }

    public Hotel(Room[][] rooms) {
        this.rooms = rooms;
    }

    public Room[][] getRooms() {
        return rooms;
    }

    public void setRooms(Room[][] rooms) {
        this.rooms = rooms;
    }

    @Override
    public String toString() {
        return "Hotel{" +
                "rooms=" + Arrays.toString(rooms) +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Hotel hotel = (Hotel) o;
        return Arrays.equals(rooms, hotel.rooms);
    }
}
