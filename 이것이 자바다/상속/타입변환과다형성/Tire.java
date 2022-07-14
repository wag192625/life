package 상속.타입변환과다형성;

public class Tire {
    public int maxRotation;         //최대 회전수
    public int accumulatedRotation; //누적 회전수
    public String location;         //타이어의 위치

    public Tire(String location, int maxRotation) {
        this.location = location;           //타이어의 위치
        this.maxRotation = maxRotation;     //최대 회전수(타이어 수명)
    }

    public boolean roll(){
        ++accumulatedRotation;
        if(accumulatedRotation<maxRotation) {
            System.out.println(location + "Tire 수명" +(maxRotation-accumulatedRotation)+"회");
            return true;
        } else {
            System.out.println("*** "+location+"Tire 펑크 ***");
            return false;
        }
    }
}