package ch10;

public class Bus {

    int busNumber;
    int count;
    int money;

    public Bus(int number){
        busNumber = number;
        //객체 생성시에 제일 먼저 실행되는 부분
    }

    //승객을 태우다
    public void take(int pay){
        money += pay;
        //money = money + pay;
        count++;
    }

    public void showInfo(){
        System.out.println("-----상태창-----");
        System.out.println("버스호선 : " + busNumber);
        System.out.println("승객수 : " + count);
        System.out.println("수익금 : " + money);
    }
}
