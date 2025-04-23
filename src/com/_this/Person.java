package com._this;

/*
 * 클래스 설계하는 코드
 * */
public class Person {

    /*this 에 3가지 사용법이 존재한다
    자기 자신의 주소를 가르킨다
    생성자에서 다른생성자를 호출할떄 사용할수 있다
    자신의 주소를 반환 시킬수있다*/

    private String name;
    private int age;
    private String phone;
    private String gender;

    //1.사용법 (문법,왜)
    //첫번째 생성자 사용방법
    public Person(String name, int age) {
        //this 안 쓰면 가까운거 매개변수 = 매개변수
        //멤버변수 = 매개변수
        this.name = name;
        this.age = age;
        System.out.println("1번 생성자 호출됨");
    }

    //생성자 여러개 만들면 생성자 오버로딩
    //2.사용방법
    // this(); <- 생성자에서 다른 생성자를 호출할수 있다
    public Person(String name, int age, String phone) {
        //System.out.println("1");
        //this.name = name;
        //this.age = age;
        this(name, age);

        this.phone = phone;
        System.out.println("2번 생성자 호출됨");
    }

    public Person(String name, int age, String phone, String gender) {
        this(name, age, phone);
        this.gender = gender;
        System.out.println("3번 생성자 호출됨");

        //3.현재 생성된 객체 즉, 나의 주소를 외부로 반환 시킬수 있다.
        //디자인 패턴 (프로그램 작성할때 일관된 문제가 발생할수 있다)
        //특정 코드의 패턴을 만들어서 해결해 나가는 방법적인 코드 패턴
            //public Person getPerson() {
            //  return this;
            //}
    }
}//end of class
