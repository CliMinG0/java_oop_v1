package com._interface;
//HOW - interface 선언하면된다
//선언된 매서드는 모두 추상 매서드가 되어야한다
//WHY
public interface Animal {

    //매서드 선언부만 있고 바디가 없다 - 추상매서드
    public abstract void eat();
    //생략이 가능하다. abstract 키워드
    void move();

}
