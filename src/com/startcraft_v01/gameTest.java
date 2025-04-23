package com.startcraft_v01;

import java.util.Scanner;

public class gameTest {

    public static void main(String[] args) {

        //실행의 흐름을 만들어보기

        Scanner scanner = new Scanner(System.in);

            Zealot zealot1 = new Zealot( "질럿");
            Marine marine1 = new Marine("마린");
            Zergling zergling1 = new Zergling("저글링");

            //zealot1.attackZergling(marine1);
            //zealot1.attackMarine(marine1);
           // marine1.showInfo();

        while(true){
            System.out.println("1.질럿2.저글링3.마린중 선택해주세요");
            int selected = scanner.nextInt();
            if(selected == 1){
                System.out.println("누구를 공격하시겠습니까 1. 마린 2.저글링");
                    int target = scanner.nextInt();
                    if(target == 1){
                        zealot1.attackMarine(marine1);
                    } else if (target == 2) {
                        zealot1.attackZergling(zergling1);
                    }

            } else if (selected == 2) {
                System.out.println("누구를 공격하시겠습니까 1.질럿 2.마린");
                int target = scanner.nextInt();
                if (target == 1){
                    zergling1.attackZealot(zealot1);
                } else if (target == 2) {
                    zergling1.attackMarine(marine1);
                }

            } else if (selected == 3) {
                System.out.println("누구를 공격하시겠습니까 1.질럿 2.저글링");
                int target = scanner.nextInt();
                if (target == 1){
                    marine1.attackZealot(zealot1);
                } else if (target == 2) {
                    marine1.attackZergling(zergling1);
                }

            } else if (selected == 0) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }else{
                System.out.println("잘못된선택입니다.");
            }
        }

    }//end of main
}//end of class
