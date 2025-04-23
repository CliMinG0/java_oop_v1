package com.array;

public class arrayTest2 {

    public static void main(String[] args) {

          char[] alphabet = new char[26];
//        alphabet[0] = 'A';
//        System.out.println((int)alphabet[0]);
//
//        alphabet[1] = 'B';
//        System.out.println((int)alphabet[1]);


        /*char 타입은 원래 정수값
        컴퓨터는 0,1 이진수로 데이터로 표현한다.
        문자 문자열로 아주 많이 다루고 있다.
        컴퓨터에서 문자를 표현하기 위해서 문자표를 사용
        아스키코드 - 미국,euckr - 한국,유니코드 - 공통
        아스키코드는 1바이트 안에 하나에 문자를 다 표현할수 있다.*/

        /*인코딩-문자를 컴퓨터가 이해할수있는 숫자로 변환하는과정
        디코딩-숫자를 사람이 읽을수 있는 문자로 변환하는 과정*/

        for(int i = 0; i < alphabet.length; i++) {
            alphabet[i] = (char)('A' + i);
        }

        for (int i = 0; i < alphabet.length; i++) {
            System.out.println(alphabet[i]);
            System.out.println((int)alphabet[0+i]);
        }

    }//end of main
}//end of class
