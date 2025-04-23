package ch04;

public class ForMainTest2 {
    public static void main(String[] args) {

        //반복적인 패턴이 보인다면 반복문을 생각하자

        //화면의 구구단 2단,3단,4단을 출력하시오
        int num = 2;

        System.out.println(num +  " * 1 = " + (num * 1));
        System.out.println(num +  " * 2 = " + (num * 2));
        System.out.println(num +  " * 3 = " + (num * 3));
        System.out.println(num +  " * 4 = " + (num * 4));
        System.out.println(num +  " * 5 = " + (num * 5));
        System.out.println(num +  " * 6 = " + (num * 6));
        System.out.println(num +  " * 7 = " + (num * 7));
        System.out.println(num +  " * 8 = " + (num * 8));
        System.out.println(num +  " * 9 = " + (num * 9));

        System.out.println("====================");
        num = 3;

        System.out.println(num +  " * 1 = " + (num * 1));
        System.out.println(num +  " * 2 = " + (num * 2));
        System.out.println(num +  " * 3 = " + (num * 3));
        System.out.println(num +  " * 4 = " + (num * 4));
        System.out.println(num +  " * 5 = " + (num * 5));
        System.out.println(num +  " * 6 = " + (num * 6));
        System.out.println(num +  " * 7 = " + (num * 7));
        System.out.println(num +  " * 8 = " + (num * 8));
        System.out.println(num +  " * 9 = " + (num * 9));


        //문제 6단부터 9단까지 출력하시오

        num = 6;
        for(int i = 1; i < 10; i++) {
            System.out.println(num + " * " + i + " = " + (num * i));

        }

        num = 7;
        for (int i = 1; i < 10; i++) {
            System.out.println(num + " * " + i + " = " + (num * i));

        }

        num = 8;
        for (int i = 1; i < 10; i++) {
            System.out.println(num + " * " + i + " = " + (num * i));

        }

        num = 9;
        for (int i = 1; i < 10; i++) {
            System.out.println(num + " * " + i + " = " + (num * i));

        }

    }
}
