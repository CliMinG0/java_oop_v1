package com.Polymorphism;

public class EMart {

    public static void main(String[] args) {
        Banana banana1 = new Banana();
        Banana banana2 = new Banana();

        //배열
        //배열을 사용할떄는 반드시 크기를 먼저 지정해야 한다
        //배열에 길이와 요소에 길이(크기)는 항상 동일한 것은 아니다
        Banana[] bananas = new Banana[10];
        bananas[0] = banana1;
        bananas[1] = banana2;

        Peach[] peaches = new Peach[10];
        peaches[0] = new Peach();
        peaches[1] = new Peach();

        System.out.println("-----------");
        //다형성 ->유연한 코드를 작성할수있다

        Fruit[] fruits = new Fruit[5];
        fruits[0] = new Banana();
        fruits[1] = new Peach();
        fruits[2] = new Banana();
        fruits[3] = new Peach();

        //도전문제
        for (int i = 0; i < fruits.length; i++) {
            //배열안에 들어있는 각각의 객체 showInfo() 전부호출
            //만약 데이터타입이 바나나일경우 원산지 정보 saleBanana() 메서드를 출력
            if (fruits[i] != null) {
                fruits[i].showInfo();
                if (fruits[i] instanceof Banana) {
                    String origin = ((Banana) fruits[i]).origin;
                    System.out.println("origin : " + origin);
                    ((Banana) fruits[i]).saleBanana();
                }
            }
        }
    }
}
