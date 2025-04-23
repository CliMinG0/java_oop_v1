package com.Oop1;

public class MainTest {
    public static void main(String[] args) {

        student s1 = new student("티모",10000);
        Bus bus1 = new Bus(100);
        Bus bus2 = new Bus(133);

        s1.takeBus(bus2);

        s1.showInfo();
        System.out.println("------------");
        bus2.showInfo();

    }
}
