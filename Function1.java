package ch07;

public class Function1 {
    //함수를 만들어보자 (함수를 설계하는 코드)
    //함수 만들기 위해서는 당연히 머리속에 어떻게 만들지 들어가있어야 한다
    //두개의 정수값을 받아서 덧셈연산을 하고 그결과를 변환하는 함수를 만들꺼야

    //static - 아직 모름
    //int - 반환 될 데이터 타입
    //add - 함수의 이름
    //(n1, n2) - 매개 변수 (파라미터)
    //{...} 함수의 몸체
    static int add (int n1, int n2) {
        //int result = n1 + n2;
        //클래스 바로 아래쓰는 변수 - 멤버 변수
        //함수 안에 선언하는 변수 - 지역변수
        int result; //지역변수를 선언했다.
        result = n1 + n2;
        return result;
         }

    static int add2 (int n1, int n2, int n3) {
        int result;
        result = n1 + n2 + n3;
        return result;
        }
        static double add3(double d1, double d2) {
            double result = d1 + d2; // 지역 변수 선언과 동시에 초기화(값을 넣다) 했다
            return result;
        }
            static void sayHello(int myAge){
            System.out.println("안녕 내 나이는"+ myAge + "이야");
            //리턴 타입 void -반환 값이 없다 그래서 return 키워드를 사용하지 않아도 됩니다
    }
}


