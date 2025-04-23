package variable;

public class Var4 {
//코드의 진입점
    public static void main(String[] args) {

        //변수를 선언 했다. 변수에 값을 넣다. 변수를 사용할수 있다.
        //변수를 선언할때 이름짓기

        //규칙이 있음
        //1.대소문자 명확히 구분하며 길이에 제한이 없다
        int age = 10;
        int Age = 20;
        int aGe = 30;
        //참고 - 같은 파일에 같은 이름에 변수를 선언할수 없다.
        //int age;

        //2.자바에서 사용하는 예약어는 사용할수 없다.
        //int, double, char, for, while, if

        //3.변수 이름은 숫자로 시작할수 없다.
        //int 30age;
        //int tel30box; 중간 혹은 끝은 가능 하다.

        //4.특수문자는 _(언더바), $(달러)만 표기 가능하다.
        int _count;
        int $count;
        //int !count; !사용불가
        //int count_tel$; 동시에 사용 가능, 중간마지막에도 표기 가능

        //권장사항 표기법
        //xxx. java 파일을 만들때
        //대문자로 시작하고 다음 단어는 소문자로 진행 그리고 연결에 단어 시작은 대문자로 작성
        //HelloJava.java (파일을 만들때 표기법) - 파스칼 케이스

        // int telBox 변수를 선언할때 표기법
        //단어시작은 소문자로 시작하고 연결이 단어 시작은 대문자로 시작한다.
        //카멜 케이스로 작성한다.

    }//end of main

}//end of class
