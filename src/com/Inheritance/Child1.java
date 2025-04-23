package com.Inheritance;

public class Child1 extends Super1{

    int age;

    //상속관계에 있어서
    //부모가 "먼저" 존재해야 자식이 존재할수 있다
    public Child1(String name, int age){
        super(name);
        this.age = age;

    }

}
