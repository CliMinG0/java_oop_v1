package com.mytest;

public class NumberPrinter {

    private int id;

    public static int waitNumber;

    public NumberPrinter(int id){
        this.id = id;
        this.waitNumber = 1;
    }
    public void printWaitNumber(){
        System.out.println(id + "기기에 대기 순번은 : " + waitNumber);
        waitNumber++;
    }
}
