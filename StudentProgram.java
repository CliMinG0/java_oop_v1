package ch05;

//1.코드를 실행하는측
public class StudentProgram {
    //코드의진입점
    public static void main(String[] args) {
        int a = 10;

        //Student 클래스를 메모리에 올려보자
        //s1이라는 클래스를 인스턴스화 했다.
        //인스턴스화 = 메모리 올리는 행위
        Student s1 = new Student();

        System.out.println(" s1 : " + s1);
        System.out.println(" a  : " + a);

        /*변수에 가장 큰 2가지 종류
        * 기본 데이터 타입 : 상자에 값이 담긴다
        * 참조 데이터 타입 : 주소값이 담긴다*/

    }//end of main
}//end of class
