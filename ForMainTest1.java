package ch04;

public class ForMainTest1 {
    public static void main(String[] args) {

        //반복문 - 반복적인 패턴이 보이나?
        //0 부터 9까지 화면에 출력 하시오

        System.out.println(0);
        System.out.println(1);
        System.out.println(2);
        System.out.println(3);
        System.out.println(4);
        System.out.println(5);
        System.out.println(6);
        System.out.println(7);
        System.out.println(8);
        System.out.println(9);

        System.out.println("================" );
        for(int i = 0; i < 10; i++) {
            //수행문
            System.out.println("i : " + i);
            System.out.println(i);
            System.out.println("최종결과 = " + i);
        }
    }
}
