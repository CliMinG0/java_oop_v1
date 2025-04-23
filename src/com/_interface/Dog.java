package com._interface;


//인터페이스는 구현받다 , 구현하다.
//animal이라는 인터페이스를 구현받다
public class Dog implements Animal {

    //추상매서드를 구현매서드로 재정의
    @Override
    public void eat() {
        System.out.println("강아지가 먹이를 먹습니다");
    }

    @Override
    public void move() {
        System.out.println("강아지가 달린다");
    }

}

class Bird implements Animal {

    @Override
    public void eat() {
        System.out.println("새가 모이를 먹습니다");
    }

    @Override
    public void move() {
        System.out.println("새가 하늘을 날아 다닙니다");
    }

    public static void main(String[] args) {

        Animal Dog = new Dog();
        Animal Bird = new Bird();

        Dog.eat();
        Dog.move();

        Bird.eat();
        Bird.move();
    }
}



