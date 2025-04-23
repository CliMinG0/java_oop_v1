package com.mytest;

import com.Books.Book;

public class MyTest2 {

    public static void main(String[] args) {

        Book[] books = new Book[10];
        books[0] = new Book("UI","");
        books[1] = new Book("무궁화","");
        books[2] = new Book("흐르는강물","");
        books[3] = new Book("리딩리드","");
        books[4] = new Book("사피엔스","");

        String title9 = books[9].getTitle();
        String author9 = books[9].getAuthor();

        System.out.println("title9 : " + title9);
        System.out.println("author9 : " + author9);

        for (int i = 0; i < books.length; i++){
            if (books[i] != null) {
                System.out.println(books[i].getTitle());
            }
        }

    }
}
