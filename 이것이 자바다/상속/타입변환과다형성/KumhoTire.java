package 상속.타입변환과다형성;

public class KumhoTire extends Tire{
    public KumhoTire(String location, int maxRotation){
        super(location, maxRotation);
    }
    @Override
    public boolean roll() {
        ++accumulatedRotation;
        if (accumulatedRotation < maxRotation) {
            System.out.println(location + "KumhoTire 수명: " +
                    (maxRotation - accumulatedRotation) + "회");
            return true;
        } else {
            System.out.println("*** " + location + "KumhoTire 펑크 ***");
            return false;
        }
    }
}