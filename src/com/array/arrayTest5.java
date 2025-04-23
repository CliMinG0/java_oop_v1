package com.array;

import java.util.Random;

public class arrayTest5 {
    public static void main(String[] args) {

        //문자열 배열 선언 및 초기화 (값을 넣을 예정)
        String[] fruits = {"Apple", "Banana", "Orange", "Mango"};
        System.out.println(fruits.length);

        //랜덤한 숫자를 하나뽑아서 해당하는 번호에 과일을 출력하고 싶다.
        Random random = new Random();
        //0,1,2,3
        int choice = random.nextInt(4);

        System.out.println("오늘의 과일은 : " + fruits[choice]);

    }//end of main
}//end of class
