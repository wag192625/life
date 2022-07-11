package Going;

public class Master implements Way{
    //고속도로 이용
    int speed = 100;


    @Override
    public void driveway() {

    }

    public void highway() {
        System.out.println(speed + "로 달립니다.");

    }
}
