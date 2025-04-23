package com.association;

public class Student {

    private String name;
    private Course course; //연관관계 (포함관계)

    public Student(String name) {
        this.name = name;
        course = null; //초기에는 수강을 하지 않음
    }

    //수강을 듣다라는 기능
    //과목에 대한 정보는 course에 있다
    public void enroll(Course course) {
        this.course = course;
        System.out.println(name + "가" + course.getName() + "강의를 수강합니다");
    }

    //도전과제
    //수강종료기능을 만드시오
    public void end() {
        if(course == null) {
            System.out.println("이미 수강 중인 상태가 아닙니다.");
        } else {
            System.out.println(course.getName() + " 을 수강 취소 합니다.");
            this.course = null;
        }
    }

    //학생에 현재 수강중인 상태를 보여준 기능
    public void showCourse() {
        if (this.course != null) {
            System.out.println(name + "이(가)" + this.course.getName() + "을 수강하는중");
        } else {
            System.out.println("수강중인 강의가 없습니다");
        }
    }
}
