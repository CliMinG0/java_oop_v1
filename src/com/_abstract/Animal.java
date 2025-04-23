package com._abstract;
/*추상클래스란
* 하나이상의 추상메서드를 포함하는 클래스이거나
* class키워드 앞에 abstract 가지고있으면 추상클래스입니다
* 강제적으로 타입으로만 설계하는 기법을 말한다
* abstract - 강제성*/
public abstract class Animal {

    String name;

    public void move(){
        System.out.println("이동");
    }

    //추상메서드를 만들어보자
    //클래스 내에 단 하나라도 추상 메서드를 가지고 있다면
    //그 클래스는 반드시 추상클래스가 되어야 된다.
    public abstract void hunt();
}
