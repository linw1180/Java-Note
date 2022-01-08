package com.luis.note.hotel;

/**
 * @Author: Luis
 * @date: 2022/1/8 22:13
 * @description: 房间类
 */
public class Room {
    private int roomNo;
    private String type;
    private boolean status;

    public Room() {
    }

    public Room(int roomNo, String type, boolean status) {
        this.roomNo = roomNo;
        this.type = type;
        this.status = status;
    }

    public int getRoomNo() {
        return roomNo;
    }

    public void setRoomNo(int roomNo) {
        this.roomNo = roomNo;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "[" + roomNo + " " + type + " " + (status ? "空闲" : "占用") + "]";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || !(o instanceof Room)) return false;
        Room room = (Room) o;
        return roomNo == room.roomNo;
    }
}
