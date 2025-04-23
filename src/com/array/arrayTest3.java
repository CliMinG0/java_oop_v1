package com.array;

import java.util.Random;

public class arrayTest3 {
    public static void main(String[] args) {

    //난수발생기능 - 랜덤한 숫자를 만들어주는 도구
        //자바 개발자들이 미리 만들어둔 도구

        Random random = new Random();
        //문서 <- 구글링, chatGPT
        //0 ~ 44까지 랜덤 번호
        int ranInt1 = random.nextInt(45)  + 1;
        int ranInt2 = random.nextInt(45)  + 1;
        int ranInt3 = random.nextInt(45)  + 1;
        int ranInt4 = random.nextInt(45)  + 1;
        int ranInt5 = random.nextInt(45)  + 1;
        int ranInt6 = random.nextInt(45)  + 1;

        //배열과 for문을 이용해 코드를 수정
        //베열을 미리 사용할 공간 크기를 정해주어야 한다
        //xxx.length를 활용

        int[] number = new int[6];
        number[0] = ranInt1;

        for(int i = 0; i < number.length; i++) {
            number[0] = ranInt1 + i;
        }

    }//end of main
}//end of class
