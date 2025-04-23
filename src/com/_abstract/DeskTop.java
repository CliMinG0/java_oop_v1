package com._abstract;

public class DeskTop extends Computer {

    @Override
    public void display() {
        System.out.println("화면이 켜짐");
    }

    @Override
    public void typing() {
        System.out.println("타자를 입력");
    }
}
