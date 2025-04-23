package com._abstract;

public abstract class Computer {

    public abstract void display();

    public abstract void typing();

    public void turnon() {
        System.out.println("전원을 킴");
    }

    public void turnoff() {
        System.out.println("전원을 끔");
    }
}
