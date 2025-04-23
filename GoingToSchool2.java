package ch10;

public class GoingToSchool2 {
    public static void main(String[] args) {
        //버스객체를 3개 생성해보시오
        //학생객체를 2명 생성해보시오
        //학생이 버스를 타는 행위를 만들어보세요
        //버스에 상태창을 출력해서 결과를 확인해 보자.

        Bus bus1 = new Bus(133);
        Bus bus2 = new Bus(1004);
        Bus bus3 = new Bus(1234);
        Student student1 = new Student("학생1",10000);
        Student student2 = new Student("학생2",10000);
//학생의 기본 정보
        student1.showInfo();
        student2.showInfo();
//학생이 버스에 탐
        student1.takeBus(bus3);
        student2.takeBus(bus1);
        student2.takeBus(bus2);
        student1.takeBus(bus2);
//버스와 학생의 정보
        bus1.showInfo();
        bus2.showInfo();
        bus3.showInfo();
        student1.showInfo();
        student2.showInfo();
    }
}
