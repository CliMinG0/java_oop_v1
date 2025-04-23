//package com.mytest;
//
//import com.Composition.House;
//import com.Composition.Room;
//
//public class MyTest5 {
//
//    private String address;
//    Room[] rooms;
//
//    public House(String address) {
//        this.address = address;
//        this.rooms = new Room[3];
//        rooms[0] = new Room("거실");
//        rooms[1] = new Room("침실");
//        rooms[2] = new Room("주방");
//    }
//
//    void showrooms() {
//        System.out.println(address + "에 있는 방 목록");
//        for (int i = 0; i < rooms.length; i++) {
//            if (rooms[i] != null) {
//                rooms[i].describe();
//            }
//        }
//    }
//
//    public static void main(String[] args) {
//        House house = new House("부산시 진구");
//        house.showRooms();
//        house = null;
//    }
//}



