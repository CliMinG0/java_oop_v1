package ch04;

public class ForMainTest3 {
    public static void main(String[] args) {

        //1부터 50 정수값 출력 하시오 . 그값이 짝스면 출력하라
        for(int i=1; i < 51; i++){
            //i값이 짝수라면
            if(i % 2 != 0){
                //짝수로 판단할수 있다
                System.out.println(i);
            }
        }
        //int sum = 1+2+3+4+5+6+7+8+9+10;
        int sum = 0;
        for (int i=1; i<11; i++){
            //sum = sum + i;
            sum += i;
        }
            System.out.println("sum 값 : " + sum);

    }
}
