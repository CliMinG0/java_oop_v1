package ch08;

public class DogMainTest1 {
    public static void main(String[] args) {
//기본생성자
//        Dog d1 = new Dog();
//        d1.name = "흰둥이";

//사용자정의생성자
        Dog d2 = new Dog("흰둥이");
        System.out.println(d2.name);

    }
}
