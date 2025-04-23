package com._interface;

//
public class Television extends HomeAppliance implements RemoteController{

    @Override
    public void turnOn() {
        System.out.println("tv 전원을켭니다");
    }

    @Override
    public void turnOff() {
        System.out.println("tv 전원을끕니다");
    }

}
