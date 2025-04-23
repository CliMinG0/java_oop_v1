package ch07;

public class Function2 {
    public static void main(String[] args) {
        /*위에는 int,String등 어떻게 받을 것인지 정하고, 이름,파라미터값을 정한후
        * 출력을한다*/
        int sub1Result = sub1(100, 50);
        System.out.println("sub1Result : " + sub1Result);
        int sub1Result2 = sub1(5, 1);
        System.out.println("sub1Result2 : " + sub1Result2);

        }
       /*아래는
       public = 공용, private = 개인, static = 정적 그후
       int,String등 어떻게 받을것인지 정하고 (파라미터값)을 정한다.
       받을값에, 이름 적고, 파라미터 계산방식을 정한다.
       결과값 return 적어달라하고 이름, 다만 void일때는 return을 적지 않는다.*/
    static int sub1(int n1, int n2){
        int result = n1 - n2;
        return result;
    }
}



