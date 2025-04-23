package ch04;

public class continueTest1 {
    public static void main(String[] args) {
        //continue문은 보통 반복문내부에서 조건과 함꼐 사용하며
        //조건이 맞는경우 반복문 내에나든 수행무으사용하지 않난다

        //1부터 100까지 숫자중에 3의 배수만을 출력

        int num;
        for (num =1;num <=100; num++){
            //만약 num같이 3의 배수가 아니라면
            if (num % 3 != 0){
                continue;
            }
            System.out.println("num : " + num);
        }
    }
}
