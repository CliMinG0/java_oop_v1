package ch07;

public class FunctionMainTest1 {

    //메인함수
    public static void main(String[] args) {

        //여기에서 함수를 호출해서 사용할수 있어
        int sub1Result = sub1(100, 50);//함수 호출은 모양맞추기다,
        System.out.println("sub1Result : " + sub1Result);
        int sub1Result2 = sub1(5, 1);
        System.out.println("sub1Result2 : " + sub1Result2);
//        sub1(0.5,1);
//        sub1(true,1);
//        sub1("반가워", 1);
//add1 함수를 호출하시오
        int sum1 = add1(10, 20, 30);
        System.out.println("sum1 : " + sum1);
    }//end of main

    //함수 선언 - 두수 를 받아서 뺄셈하는 함수를 선언해보자
    static int sub1(int n1, int n2) {
        int result = n1 - n2;
        return result;
    }
        static int add1 (int n1, int n2, int n3){
            int result = n1 + n2 + n3;
            return result; //실행의 제어권을 반납한다 즉 결과 값을 보여줘라
        }

}//end of class
