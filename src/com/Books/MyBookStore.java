package com.Books;

import java.util.Scanner;

/*
 모든 프로그래밍에 기본은 C.R.U.D이다
 */
public class MyBookStore {
//샘플데이터
    //샘플지우면 인덱스 0 부터 하면됨

    static int currentBookIndex = 6;

    //메인함수
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        //배열준비
        Book[] books = new Book[100]; //배열 100 선언
        //books = null; 가리키는 공간이 없다
        boolean flag = true;

        //샘플데이터 미리 만들어두기 todo 추후 삭제하기
        books[0] = new Book("플러터 UI 실전", "김근호");
        books[1] = new Book("무궁화꽃이 피었습니다", "김진명");
        books[2] = new Book("흐르는강물처럼", "파울로코엘료");
        books[3] = new Book("리딩으로리드하라", "이지성");
        books[4] = new Book("사피엔스", "유발하라리");
        books[5] = new Book("홍길동전", "허균");

        //상수 선언
        final String SAVE = "1";
        final String SEARCH_ALL = "2";
        final String SEARCH_BY_TITLE = "3";
        final String DELETE_ALL = "4";
        final String END = "5";

        //문자열도 받을수 있다
        while (flag) {
            System.out.println(" * 메뉴선택 * ");
            System.out.println("1.저장 2.전체조회 3.선택조회 4.전체삭제 5.종료");
            String selectedNumber = scanner.nextLine(); //문자열 + 줄바꿈
            //숫자 비교할때 == 사용한다
            //문자 비교할땐 "문자열".equals ("문자열") ->true 다르다면 false 반환한다
            //문자열 비교할땐 무조건 equals() 메소드를 사용하다
            if (selectedNumber.equals(SAVE)) {
                System.out.println(">>저장하기<<");
                save(scanner, books);

            } else if (selectedNumber.equals(SEARCH_ALL)) {
                System.out.println(">>전체조회<<");
                readAll(books);

            } else if (selectedNumber.equals(SEARCH_BY_TITLE)) {
                System.out.println(">>책 제목으로 조회하기<<");
                readByTitle(scanner, books);

            } else if (selectedNumber.equals(DELETE_ALL)) {
                System.out.println(">>전체 삭제 하기<<");
                deleteAll(books);

            } else if (selectedNumber.equals(END)) {
                System.out.println(">>프로그램종료<<");
                flag = false; //while(false) 가 되어서 종료됨

            } else {
                System.out.println(">>잘못된 선택입니다<<");
            }//if end

        }//while end

    }//end of main

    //저장하기  (하나의 북 개체를 배열에 저장하는 기능)
    public static void save(Scanner scanner, Book[] books) {
        System.out.println("--save--");
        //사용자에 값을 받아서 - 데이터를 모아서 북개체를 생성하고 배열공간에 넣어야 한다
        System.out.println("책제목을 입력하세요");
        String title = scanner.nextLine();
        System.out.println("저자를 입력하세요");
        String author = scanner.nextLine();

        Book book = new Book(title, author);
        //books 이라는 배열에 북 객채를 저장하는 배열이 된다
        //인덱스번호를 어디까지 저장했는지에 대한 정보도 필요하다 (static 변수로 관리함)
        if (currentBookIndex > books.length) {
            System.out.println("더이상 저장할 공간이 없습니다.");
            return;
        }
        books[currentBookIndex] = book;
        currentBookIndex++;
    }

    //전체조회하기
    public static void readAll(Book[] books) {
        System.out.println("--readAll--");
        for (int i = 0; i < books.length; i++) {
            //방어적코드
            if (books[i] != null) {
                System.out.println(books[i].getTitle() + "," + books[i].getAuthor());
            }
        }

    }

    //책이름으로 조회
    public static void readByTitle(Scanner scanner, Book[] books) {
        System.out.println("--readByTitle--");
        System.out.println(">>책 제목을 입력해주세요<<");
        //문자열 기능중에 공백 제거 기능이 있다 .trim(); 앞에공백 뒤에공백 을 알아서 없애준다
        String title = scanner.nextLine();

        boolean isFind = false;
        //찾는기능을 만들자
        //배열공간 100개짜리 순회해야한다

        for (int i = 0; i < books.length; i++) {
            //equals를 쓰자
            //방어적코드  = 북i가 not null이 아닐때
            if (books[i] != null) {
                //title.trim() <- 공백제거 양끝만 가능
                if (books[i].getTitle().equals(title.trim())) {
                    //찾았다면 출력
                    System.out.println(books[i].getTitle() + "," + books[i].getAuthor());
                    isFind = true;
                    break;
                }
            }
        }

        if (!isFind) {
            //만약 책을 못찾았을경우만 출력
            System.out.println("해당제목의 책은 존재하지 않습니다");
        }

    }

    //전체삭제 - 배열안에 담겨있는 book() 전부 null처리
    public static void deleteAll(Book[] books) {
        System.out.println("--deleteAll--");
        //전체삭제중
        //1.배열 주소 가지고 와서 반복문 100 = null
        for (int i = 0; i < books.length; i++) {
            books[i] = null;
        }
    }
}//end of class
