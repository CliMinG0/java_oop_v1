package com.array;
/*
* 배열이란 연관된 데이터 타입에 요소들을 통으로 관리하기위해 사용한다
*/
public class intArrayCRUD {
    public static void main(String[] args) {

            //1.생성(create) = C
        //배열은 반드시 크기(길이 지정해주어야 한다)
        //인덱스 번호를 통해서 각요소를 찾아갈수 있다
        //모든 인덱스의 번호는 0부터 시작된다.
        int[] intArray = new int[5];
        //배열은 보통 반복문과 함꼐 많이 사용 된다
        //intArray.length는 현재 배열의 길이를 리턴해준다.
        //              0      5
        for (int i = 0; i < intArray.length; i++){
            intArray[i] = (i + 1) * 10; //10, 20, 30
        }

            //2.조회(read) = R
        //System.out.println(intArray[0]);
        for(int i = 0; i < intArray.length; i++){
            System.out.println(intArray[i]);
        }

            //3.수정(Update) = U
        intArray[2] = 3;
        System.out.println("intArray[2] 수정후 : " + intArray[2]);

            //4.삭제(Delete) = D
        //배열은 고정길이임으로 특정 인덱스를 0으로 초기화 하여 논리적으로 삭제했다 할수있다
        //요소에 대한 삭제개념
        intArray[2] = 0;
        System.out.println("intArray[2] 삭제후 : " + intArray[2]);

        System.out.println("프로그램종료");

    }
}
