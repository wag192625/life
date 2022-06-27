package weapon.weaponChange;

public class RedSlime extends NomalSlime{
    
    public RedSlime(int input_hp, int input_mp, String input_color, String input_name){
        this.hp = input_hp;
        this.mp = input_mp;
        this.name = input_name;
        this.color = input_color;
    }
    
    public void getColor() {
        System.out.println("이 슬라임의 색상은 " +this.color+" 입니다.");
        System.out.println("이 슬라임의 이름은 " +this.name+" 입니다.");
        System.out.println("이 슬라임의 hp은 " +this.hp+" 입니다.");
        System.out.println("이 슬라임의 mp은 " +this.mp+" 입니다.");
    }

    @Override
    public int att() {
        return criticalAtt();
    }

    public int criticalAtt() {
        return hp/2;
    }
}
