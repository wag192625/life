package Going;

public class Beginner implements Way{
    int speed = 30;

    public void driveway() {
        System.out.println( speed + "으로 달립니다.");
    }

    @Override
    public void highway() {

    }
}
