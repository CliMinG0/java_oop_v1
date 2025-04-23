package com.mytest;

import java.util.Scanner;

public class MyTest3 {

    static int currentCallIndex = 6;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Call[] calls = new Call[100];
        boolean flag = true;

        calls[0] = new Call("가","010","1가");
        calls[1] = new Call("나","012","2가");
        calls[2] = new Call("다","111","2나");
        calls[3] = new Call("라","456","나8");
        calls[4] = new Call("마","888","0마");
        calls[5] = new Call("경찰","112","긴급");

        final String SAVE = "1";
        final String SEARCH = "2";
        final String FIX = "3";
        final String DELETE = "4";
        final String PICK = "5";
        final String END = "6";

        while (flag) {
            System.out.println("메뉴선택");
            System.out.println("1.저장 2.조회 3.수정 4.삭제 5.선택조회 6.종료");
            String selectedN = scanner.nextLine();

            if (selectedN.equals(SAVE)) {
                System.out.println("저장");
                save(scanner, calls);
            } else if (selectedN.equals(SEARCH)) {
                System.out.println("조회");
                readAll(calls);
            } else if (selectedN.equals(FIX)) {
                System.out.println("수정");
                Fix(scanner,calls);
            } else if (selectedN.equals(DELETE)) {
                System.out.println("삭제");
                deleteAll(calls);
            } else if (selectedN.equals(PICK)) {
                System.out.println("선택조회");
                readByTitle(scanner, calls);
            } else if (selectedN.equals(END)) {
                System.out.println("종료");
                flag = false;
            } else {
                System.out.println("잘못된선택");
            }//ifend
        }//whileend
    }//end of main

    public static void save(Scanner scanner, Call[] calls) {
        System.out.println("save");
        System.out.println("이름을 입력하세요");
        String name = scanner.nextLine();
        System.out.println("번호를 입력하세요");
        String number = scanner.nextLine();

        Call Call = new Call(name, number);
        if (currentCallIndex > calls.length) {
            System.out.println("더 이상 공간이 없습니다");
            return;
        }
        calls[currentCallIndex] = Call;
        currentCallIndex++;
    }

    public static void readAll(Call[] calls) {
        System.out.println("readall");
        for (int i = 0; i < calls.length; i++) {
            if (calls[i] != null) {
                System.out.println(calls[i].getName() + "," + calls[i].getNumber());
            }
        }
    }

    public static void Fix(Scanner scanner, Call[] calls){
        System.out.println("Fix");
        for(int i = 0; i < calls.length; i++){

        }
    }


    public static void readByTitle(Scanner scanner, Call[] calls) {
        System.out.println("readyByTitle");
        System.out.println("이름을 입력해주세요");
        String name = scanner.nextLine();

        boolean isFind = false;

        for (int i = 0; i < calls.length; i++) {
            if (calls[i] != null) {
                if (calls[i].getName().equals(name.trim())) ;
                System.out.println(calls[i].getName() + "," + calls[i].getNumber());
                isFind = true;
                break;
            }
        }

        if (!isFind) {
            System.out.println("해당 번호은 없습니다");
        }

    } // end of readByTitle


    public static void deleteAll(Call[] calls) {
        System.out.println("deleteAll");
        for (int i = 0; i < calls.length; i++) {
            calls[i] = null;
        }
    }
}//end of class


