package ch07;

public class FunctionMainTest2 {
//함수호출과 스택 메모리

    public static void main(String[] args) {
        int num1;
        int num2;
        mul(10, 2);

    }

    static int mul (int n1, int n2){
        int result = n1 * n2;
        return  result;
    }

}
