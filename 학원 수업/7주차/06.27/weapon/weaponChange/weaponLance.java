package weapon.weaponChange;

public class weaponLance extends weapon1 {

    public weaponLance() {
        this.name = "랜스";
        this.ATTRange = 2;
        this.ChangeTime = 3;
    }

    @Override   //메소드의 재정의
    public void attAction() {
        System.out.println("무기"+this.name+"을 장착하였습니다.");
        System.out.println("무기의 공격 범위는 "+this.ATTRange+" 입니다.");
        System.out.println("무기의 교체 시간은 "+this.ChangeTime+" 입니다.");
    }

    @Override
    public void destrution() {
        super.destrutionbefore(super.defaultName);
        attAction();
    }
}
