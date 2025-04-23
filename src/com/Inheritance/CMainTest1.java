package com.Inheritance;

public class CMainTest1 {
    public static void main(String[] args) {

        //A,B,C
        //A,C관계는 상속관계
        C c = new C();
        c.name = "C클래스";
        c.height = 100;
        c.weight = 20;
        c.age = 10;

        c.level = 1;
        c.nickName = "C입니다";


    }//end of main
}//end of class
