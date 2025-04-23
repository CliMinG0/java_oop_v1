package com.function;

/*
 * 함수란? 데이터를 받아서 처리하고 결과를 돌려주는 코드 블록
 * Static을 사용 하면 객체 없이 바로 호출 가능
 * */
public class calculatorMain {
    public static void main(String[] args) {
        //테스트
        int num1 = 10;
        int num2 = 5;
        int testNumber = 7;

        //더하기함수 호출
        int sum = add(num1, num2);
        System.out.println(num1 + " + " + num2 + " = " + sum);

        //빼기함수 호출
        int sum1 = subtract(num1, num2);
        System.out.println(num1 + " - " + num2 + " = " + sum1);
        //곱하기함수 호출
        int sum2 = multiply(num1, num2);
        System.out.println(num1 + " * " + num2 + " = " + sum2);

        //나누기함수 호출
        double sum3 = divide(num1, num2);
        System.out.println(num1 + " * " + num2 + " = " + sum3);

        //짝수판별 함수 호출
        boolean even = isEven(testNumber);
        System.out.println(testNumber + "은(는) 짝수인가요? " + even);

        //홀수판별 함수 호출
        boolean odd = isOdd(testNumber);
        System.out.println(testNumber + "은(는) 홀수인가요? " + odd);


    } // end of main


    //두 숫자를 더하는 함수
    //함수의 선언부, 함수의 바디
    static int add(int a, int b) {
        return a + b; //입력 받은 a 와 b를 더하고 반환
    }

    //두 숫자를 빼는 함수
    static int subtract(int a, int b) {
        return a - b; //입력 받은 a에서 b를 빼서 반환
    }

    //두 숫자를 곱하는 함수
    static int multiply(int a, int b) {
        return a * b; //입력 받은 a와 b를 곱해서 반환
    }

    //두 숫자를 나누는 함수
    static double divide(int a, int b) {
        //방어적 코드를 잘 작성해야 한다.
        if (b == 0) {
            System.out.println("0으로 나눌수 없습니다.");
            return 0;
        }
        return (double) a / b; //입력 받은 a 와 b를 나눠서 반환
        //파라미터에 하나라도 double을 넣으면 실수가 나옴
    }//end of divide

    //짝수인지 판별하는 함수 - 매개변수
    static boolean isEven(int number) {
        return number % 2 == 0; //나머지가 0 이면 짝수 - true 아니면 - false
    }

    static boolean isOdd(int number) {
        return number % 2 != 0; //나머지가 0이 아니며 홀수 - true
    }
}


