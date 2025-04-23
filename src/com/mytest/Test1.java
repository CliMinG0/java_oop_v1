package com.mytest;
import com.Polymorphism.Banana;
import com.Polymorphism.Peach;
import com.Polymorphism.Fruit;


public class Test1 {

    public static void main(String[] args) {
        Banana banana1 = new Banana();
        Banana banana2 = new Banana();

        Banana[] bananas = new Banana[10];
        bananas[0] = banana1;
        bananas[1] = banana2;

//        peach[] peaches = new peach[10];
//        peaches[0] = new peach();
//        peaches[1] = new peach();

        System.out.println("----------");

        Fruit[] fruits = new Fruit[5];
        fruits[0] = new Banana();
        fruits[1] = new Banana();
        fruits[2] = new Banana();
        fruits[3] = new Banana();

        for (int i = 0; i < fruits.length; i++){
            if (fruits[i] != null) {
                fruits[i].showInfo();
            }
        }
    }
}
