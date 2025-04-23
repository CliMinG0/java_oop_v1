package ch04;

public class while1 {
    public static void main(String[] args) {

        int i = 1;
        //괄호 안에 조건식 (T, F)
        while (i <= 3) {
            System.out.println(" i 값 : " + i);
            //while 구문을 작성할떄 무한 루프를 조심
            //조건식에 처리가 없다면 무한히 반복한다.
            i += 1;
        }
        System.out.println("while종료 후 i 값 : " + i);

    }
}
