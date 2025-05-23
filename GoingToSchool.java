package ch10;

public class GoingToSchool {


    public static void main(String[] args) {
        Bus bus1 = new Bus(133);
        Bus bus2 = new Bus(1004);
        Subway subway1 = new Subway(3);
        Student s1 = new Student("홍길동",10000);
        Student s2 = new Student("티모",10000);


        s1.showInfo();
        //bus1 -> 실제 값은 주소값이다.
        s1.takeBus(bus1);

        s1.showInfo();
        bus1.showInfo();

        s2.takeBus(bus2);
        bus2.showInfo();
        s2.showInfo();

        /*사전 기반 지식
        기본 데이터 타입, 참조 데이터 타입
        int a; (값이 담긴다)
        대문자로 선언하는 데미터 타입은 참조 타입이다
        Student s1 <- s1 (주소값) */
    }
}
