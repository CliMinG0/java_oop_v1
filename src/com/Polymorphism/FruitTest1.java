package com.Polymorphism;

public class FruitTest1 {

    public static void main(String[] args) {

        //다양한 형태로 바라볼수 있다 -- 다형성
        Fruit fruit1 = new Banana(); //업캐스팅된 상태
        Fruit fruit2 = new Peach(); //업캐스팅된 상태
        fruit1.showInfo();
        System.out.println("----------");
        fruit2.showInfo();

        //사전기반지식 - 컴파일 런타임
        //업캐스팅된 상태 : 컴파일 시점에 부모에 있는 변수나 메서드만 확인을 할수있다
        String resultOrigin = ((Banana)fruit1).origin; //다운캐스팅 처리
        System.out.println("바나나 원산지 : " + resultOrigin);

        //키워드 - 인스턴스 오브 연산자
        //instanceof > 인스턴스오브 연산자 , 예약어
        if (fruit1 instanceof Peach){
            System.out.println("여기 들어올까 1");
        }

        if (fruit1 instanceof Banana){
            System.out.println("여기 들어올까 2");
        }

        //fruit1에 saleBanana()를 호출하시오

        // fruit1 에 saleBanana() 메서드를 호출 하시오.
        ((Banana) fruit1).saleBanana();
        fruit1.showInfo();


    }//end of main
}//end of class
