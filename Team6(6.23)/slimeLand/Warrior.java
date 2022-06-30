package June21.Team6.slimeLand;

public class Warrior {
    public String name;
    public int hp;
    public int mp;
    public int offpower;

    public Warrior(String input_name, int input_hp, int input_mp, int input_offpower) {
        this.name = input_name;
        this.hp = input_hp;
        this.mp = input_mp;
        this.offpower = input_offpower;
    }

    public int att() {
        return 10;
    }

    public int att_A() {
        this.mp -= 10;
        return 30;
    }

    public int att_B() {
        this.mp -= 20;
        return 50;
    }

    public void dmg(int input_dmg) {
        this.hp = this.hp - input_dmg;
        System.out.println("용사는 " +input_dmg+ "의 공격을 받았습니다.");
        System.out.println("용사의 hp : "+this.hp);
    }

    public void info() {
        System.out.println("----------------------");
        System.out.println(this.name);
        System.out.println("HP = " + this.hp);
        System.out.println("MP = " + this.mp);
        System.out.println("공격력 = " + this.offpower);
        System.out.println("----------------------");
    }
}
