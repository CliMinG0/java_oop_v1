package com.Inheritance;

public class MainTest1 {
    public static void main(String[] args) {

        //Cal 클래스와 Child Cal의 관계는 부모 자식 관계에 놓여있다
        ChildCal childCal = new ChildCal();
        int sum1 = childCal.sum(10, 10);
        System.out.println("sum1 : " + sum1);

        int minus1 = childCal.minus(100, 10);
        System.out.println("minus1 : " + minus1);

        //곱하는 기능
        //부모 클래스의 메서드를 자식클래스에서 재정의를 한다면
        //매서드 오버라이드
        int multi = childCal.multiply(10, 10);
        System.out.println("multi : " + multi);

//상속관계에 있어서 부모클래스가 먼저 존재해야 자식 클래스가 존재할수 있다.

    }//end of main
}//end of class
