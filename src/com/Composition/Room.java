package com.Composition;

public class Room {

        private String type;

        public Room(String type) {
            this.type = type;
        }

        void describe() {
            System.out.println(type + " 방입니다.");
        }
}
