package com.startcraft_v03;

import java.util.Scanner;

public class GameTest1 {

    //실행의 흐름을 스스로 만들어보자

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Unit unit = new Unit();

        while(true){
            System.out.println("1.질럿 2.저글링 3.마린");
            int select = scanner.nextInt();
            if(select == 1){
                System.out.println("어떤 유닛을 공격 1.마린/2.저글링");
                int target = scanner.nextInt();
                if(target == 1){;
                }
            }
        }



    }//end of main
}//end of class
