package com.mytest;

import com.Books.Book;

import java.util.Scanner;

public class MyTest {

    static int currentBookIndex = 6;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Book[] books = new Book[100];
        boolean flag = true;

        books[0] = new Book("플러터 UI 실전", "김근호");
        books[1] = new Book("무궁화꽃이 피었습니다", "김진명");
        books[2] = new Book("흐르는강물처럼", "파울로코엘료");
        books[3] = new Book("리딩으로리드하라", "이지성");
        books[4] = new Book("사피엔스", "유발하라리");
        books[5] = new Book("홍길동전", "허균");

        final String SAVE = "1";
        final String SEARCH = "2";
        final String TITLE = "3";
        final String DELETE = "4";
        final String END = "5";

        while (flag) {
            System.out.println("메뉴선택");
            System.out.println("1.저장 2.조회 3.선택조회 4.삭제 5.나가기");
            String selectedN = scanner.nextLine();

            if (selectedN.equals(SAVE)) {
                System.out.println("저장하기");
                save(scanner, books);
            } else if (selectedN.equals(SEARCH)) {
                System.out.println("전체조회");
                readAll(books);
            } else if (selectedN.equals(TITLE)) {
                System.out.println("책제목 조회");
                readByTitle(scanner, books);
            } else if (selectedN.equals(DELETE)) {
                System.out.println("삭제");
                deleteAll(books);
            } else if (selectedN.equals(END)) {
                System.out.println("종료");
                flag = false;
            } else {
                System.out.println("잘못된선택");
            }//ifend
        }//whileend
    }//end of main

    public static void save(Scanner scanner, Book[] books) {
        System.out.println("save");
        System.out.println("책제목을 입력하세요");
        String title = scanner.nextLine();
        System.out.println("저자을 입력하세요");
        String author = scanner.nextLine();

        Book book = new Book(title, author);
        if (currentBookIndex > books.length) {
            System.out.println("더 이상 공간이 없습니다");
            return;
        }
        books[currentBookIndex] = book;
        currentBookIndex++;
    }

    public static void readAll(Book[] books) {
        System.out.println("readall");
        for (int i = 0; i < books.length; i++) {
            if (books[i] != null) {
                System.out.println(books[i].getTitle() + "," + books[i].getAuthor());
            }
        }
    }

    public static void readByTitle(Scanner scanner, Book[] books) {
        System.out.println("readyByTitle");
        System.out.println("책제목을 입력해주세요");
        String title = scanner.nextLine();

        boolean isFind = false;

        for (int i = 0; i < books.length; i++) {
            if (books[i] != null) {
                if (books[i].getTitle().equals(title.trim())) ;
                System.out.println(books[i].getTitle() + "," + books[i].getAuthor());
                isFind = true;
                break;
            }
        }

        if (!isFind) {
            System.out.println("해당 책은 없습니다");
        }

    } // end of readByTitle


    public static void deleteAll(Book[] books) {
        System.out.println("deleteAll");
        for (int i = 0; i < books.length; i++) {
            books[i] = null;
        }
    }
}//end of class
