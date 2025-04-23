package com.Composition;

public class Computer {

    Cpu cpu;

    public Computer(){
        cpu = new Cpu();
    }

    void start(){
        cpu.start();
        System.out.println("컴퓨터가 켜집니다");
    }

    void stop(){
        cpu.stop();
        System.out.println("컴퓨터가 꺼집니다");
    }

    public static void main(String[]args){

        Computer computer = new Computer();
        computer.start();
        System.out.println("--------------------");
        computer.stop();

//        Cpu cpu = new Cpu();
//        cpu.start();
//        System.out.println("--------------------");
//        cpu.stop();

    }//end of main

}//end of class
