package com._abstract;

public class MainTest1 {

    public static void main(String[] args) {

    //객체지향 개념으로 Animal 이라는 클래스를 인스턴스화 시키면 좀 이상해진다
    Animal animal; //타입으로는 선언이 가능
    //animal = new Animal(); < 오류발생
    //Animal 클래스는 abstract를 붙여서 추상클래스로 설계
    //그러면 추상클래스는 new란 키워드 생성자를 활용해서
    //독립적으로 메모리에 올릴수 없다

        //Human human = new Human();
        //개발자가 객체를 생성시킬때 다른 사용자가 마음대로 객체를 생성시키지 못하도록
        //강제성을 지닐수 있다

    }//end of main

}//end of class
