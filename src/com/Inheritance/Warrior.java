package com.Inheritance;

public class Warrior extends Hero{

    public Warrior(String name, int hp){
        //부모 사용자 정의 생성자가 있다면 super 키워드를 사용
        //가장 먼저 부모생성자를 호출해야 한다
        super(name, hp);
    }

    //부모의 매서드를 재정의 한다면 매서드 오버라이드
    //어노테이션 주석 + 힌트
    @Override
    void attack() {
        System.out.println("전사가 공격을 합니다");
        super.attack();
    }

    void comboAttack () {
        System.out.println("전사가 콤보공격을 합니다");
    }
}
