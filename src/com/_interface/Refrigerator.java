package com._interface;

public class Refrigerator extends HomeAppliance
        implements RemoteController, SoundEffect{

    @Override
    public void soundOn() {
        System.out.println("띠리링 냉장고 문이 열림");
    }

    @Override
    public void turnOn() {
        System.out.println("냉장고 전원을켭니다");
    }

    @Override
    public void turnOff() {
        System.out.println("냉장고 전원을끕니다");
    }
}
