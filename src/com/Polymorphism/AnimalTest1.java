package com.Polymorphism;

/*하나의 데이터 타입을 다양한 형태로 바로 보는것 (다형성)
* 상세히 한 요소.. : 매서드 , 클래스 가 여러 형태를 가질수 있는 능력을 의미한다
* 상속관계 다형성을 살펴보고 있다*/
public class AnimalTest1 {

    public static void main(String[] args) {

        Animal animal1 = new Animal();
        animal1.move();
        animal1.eating();
        System.out.println("---------------");

        //다형성에 장점
        //부모타입으로 자식클래스를 인스턴스화 할수있다
        Animal animal2 = new Tiger();
        animal2.move();
        animal2.eating();
        System.out.println("---------------");

        //코드를 작성하는 시점은 ->컴파일 시점
        //프로그램을 실행 시키는 시점 ->런타임 시점

        Animal animal3 = new Human();
        animal3.move();
        animal3.eating();
        System.out.println("---------------");

    }//end of main
}//end of class
