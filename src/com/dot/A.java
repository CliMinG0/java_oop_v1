package com.dot;

public class A {

    B b;

    //생성자 (인스턴스화 될때 제일 먼저 수행되는 코드)
    public A(){
        System.out.println("A 생성자 호출됨");
        b = new B();
    }

}//end of class
