package com.Polymorphism;

public class Banana extends Fruit{

    String origin; //원산지 담을수 있는 공간 선언

    public Banana(){
        name = "델몬트바나나";
        price = 3000;
        origin = "필리핀";

    }

    public void saleBanana(){
        System.out.println("지금은 할인행사기간입니다");
        System.out.println("이 방송이 나간 이후로 바나나가격을 천원할인 합니다");
        price -= 1000;
    }
}
