package June21.Team6.slimeLand;

public class Dragon {
    public String name;
    public int hp;
    public int mp;

    public Dragon() {
        this.name = "용가리";
        this.hp = 100;
        this.mp = 100;
    }

    public Dragon(String input_name, int input_hp, int input_mp) {
        this.name = input_name;
        this.hp = input_hp;
        this.mp = input_mp;
    }

    public int att() {
        return 10;
    }

    public int att_fireball() {
        this.mp -= 10;
        return 30;
    }

    public int att_icebeam() {
        this.mp -= 20;
        return 50;
    }

    public void dmg(int input_dmg) {
        this.hp -= input_dmg;
    }

    public void info() {
        System.out.println("_______"+name+"________");
        System.out.println("HP = " + this.hp);
        System.out.println("MP = " + this.mp);
    }

}
