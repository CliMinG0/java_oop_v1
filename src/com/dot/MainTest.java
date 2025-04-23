package com.dot;

public class MainTest {

    public static void main(String[] args) {

        System.out.println("연산자의 여행");

        A a1 = new A();
        //a1.b.c //c객체가 안된 상태라서 null에러
        a1.b.c.callFinal();

    }//end of main
}//end of class
