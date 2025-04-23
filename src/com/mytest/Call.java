package com.mytest;

public class Call {


    private String name;
    private String number;
    private String callPage;

    public Call(String name, String number) {
        this.name = name;
        this.number = number;
    }

    public Call(String name, String number, String callPage) {
        this(name, number);
        this.callPage = callPage;
    }

    // getter
    public String getName() {
        return name;
    }

    public String getNumber() {
        return number;
    }

    public String getCallPage() {
        return callPage;
    }

    // setter
    public void setNumber(String number) {
        this.number = number;
    }

    public void showInfo() {
        System.out.println(">> 프로그램 <<");
        System.out.println("이름 : " + name);
        System.out.println("전화번호 : " + number);
        System.out.println("전화번호부 : " + callPage);
    }
}
