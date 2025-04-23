package com.Inheritance;

public class Wizard extends Hero{

    public Wizard(String name, int hp){
        super(name, hp);
    }

    @Override
    void attack() {
        System.out.println("전사가 공격을 합니다");
        super.attack();
    }

    void freezing () {
        System.out.println("");
    }
}
