package com.Polymorphism;

/*하나의 메서드가 메서드 여러 행태를 가질수 있는 능력을 의미한다
* move()
* 하나의 변수에 통으로 데이터를 관리하고 싶다면 자료구조 (배열)*/
public class AnimalTest2 {

    public static void main(String[] args) {

        Animal[] animal = new Animal[3];
        animal[0] = new Animal();
        animal[1] = new Tiger();
        animal[2] = new Human();

        for(int i = 0; i < animal.length; i++){
            animal[i].move();
        }

    }//end of main
}//end of class
