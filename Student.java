package ch10;

public class Student {

    String name;
    int money;

    //매개변수 2개를 받는 생성자를 만들어보자
    public  Student(String n, int m){
        name = n;
        money = m;
    }

    //학생이 버스를 탄다
    public void takeBus(Bus bus){
        bus.take(1000);
        //버스에 천원을 내고 내 멤버 변수 money (천원을 빼자)
        money -= 1000;
    }

    //학생이 지하철을 탄다

    //학생의 상태창을 보여준다
    public void showInfo(){
        System.out.println("=====상태창=====");
        System.out.println("학생이름 : " + name);
        System.out.println("학생소지금 : " + money);

    }
}
