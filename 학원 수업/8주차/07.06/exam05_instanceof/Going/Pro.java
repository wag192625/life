package Going;

public class Pro implements Way{
    int speed=60;

    public void driveway() {
        System.out.println(speed + "로 달립니다.");
    }

    @Override
    public void highway() {

    }
}
