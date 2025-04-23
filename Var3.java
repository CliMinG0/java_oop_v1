package variable;

public class Var3 {
    //코드의 진입점
    public static void main(String[] args) {

        //변수를 선언하고 값을 넣는 방법과 사용하는 방법을 확인 했다.
        //예약어 - int (자바개발자들이 미리 선점해둔 단어들)
        int a;

        //변수 agevox ,변수telbox를 선언해주세요
        int agebox; //변수에 선언
        int telbox; //변수에 선언

        //agebox 에다가 값 50을 초기화 해보세요
        agebox = 50;

        //콘솔에 agebox값을 출력하시오
        System.out.println(agebox);

        //정리
        //변수는 변할수 있는 수이고 값을 저장할수 있는 공간이다.
        //도전문제  agebox라는 변수에 값을 100으로 변경해봅시다.
        agebox = 100;

        //값이 제대로 바뀌었는지 출력해보자
        System.out.println(agebox);
        //telbox 초기화를 안했기 때문에 오류를 발생시킨다
        //System.out.println(telbox);

    }//end of main

}//end of class
