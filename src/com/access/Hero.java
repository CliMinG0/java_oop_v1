package com.access;

public class Hero {

    private String name;
    private int hp;
    private int power;
    private double defence;
    private boolean isDie;

    //getter 5개
    private String getName(){
        return name;
    }
    private int getHp(){
        return hp;
    }
    private int getPower(){
        return power;
    }
    private double getDefence(){
        return defence;
    }
    private boolean getIsDie(){
        return isDie;
    }

    //setter 5개
    private void setName(String n){
        name = n;
    }
    private void setHp(int h){
        hp = h;
    }
    private void setPower(int p){
        power = p;
    }
    private void setDefence(int d){
        defence = d;
    }
    private void setIsDie(Boolean i){
        isDie = i;
    }
}
