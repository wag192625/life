package weapon.weaponChange;

public class weapon1 {
    public static final String defaultName = "주먹";
    public static final int defaultAttrange = 1;
    public static final int defaultChangeTime = 1;
    //상수
    public static String name = "주먹";
    public int ATTRange = 1;
    public int ChangeTime = 1;
    //자식 클래스와 공유 (랜스에서는 랜스로 바뀜)

    //변할 값
    //메소드
    public void attAction() {
        System.out.println("무기"+this.name+"을 장착하였습니다.");
    }
    
    public  void destrution() {
        System.out.println("무기가 파괴되었습니다.");
    }

    public void destrutionbefore(String input_name){
        this.name = input_name;
    }
}