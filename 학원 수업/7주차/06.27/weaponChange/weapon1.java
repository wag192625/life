package weaponChange;

public class weapon1 {
    public String name;
    public int ATTRange;
    public int ChangeTime;

    weapon1() {
        this.name = "주먹";
    }
    public void attAction() {
        System.out.println("무기"+name+"을 장착하였습니다.");
    }

    public void destrution() {
        System.out.println("무기가 파괴되었습니다.");
    }
}
