package com.Inheritance;

public class Archer extends Hero{

    public Archer(String name, int hp){
        super(name, hp);
    }

    @Override
    void attack() {
        System.out.println("전사가 공격을 합니다");
        super.attack();
    }

    void fireArrow () {
        System.out.println("");
    }
}
