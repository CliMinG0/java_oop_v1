package com.OverLoading;
/*메소드 오버로딩이란
* 같은 이름의 메서드를 여러개 정의하는것을 말한다*/
public class Calculator {

    //덧셈 메서드 만들어보기
    public  int add(int a, int b){
        return a + b;
    }
    //매개변수의 데이터 타입이 다르다면 컴파일러는 구분할수 있음
    public double add(double a, double b){
        return a + b;
    }

    public int add (int a, int b, int c){
        return a + b + c;
    }

    public  String add(String str1, String str2){
        return str1 + str2;
    }
//코드의 진입점
    public static void main(String[] args) {
//println()도 메소드 오버로딩 기법이 적용된 메서드였다
        System.out.println();


    }//end of main
}//end of class
