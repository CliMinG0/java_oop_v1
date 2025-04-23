package com.mytest;

import com.access.Bank;

public class MainTest1 {
    public static void main(String[] args) {

        Bank bank2 = new Bank();
        //이 Bank 는 access 에 존재한다
        //이 패키지는 my test 만 존재
        //bank2.balance = 10; balance 변수는 접근제어 지시자가 default 라 접근 안됨
        // bank2.name = "홍길동"; 어디서나 접근 가능하다

    }
}
