package slimeland;

public class Warrior {
    public String name;
    public int hp;
    public int mp;

    public Warrior(String input_name, int input_hp, int input_mp){
        this.name = input_name;
        this.hp = input_hp;
        this.mp = input_mp;

    }

    public int att() {
        return 10;
    }

    public int att_A() {
        this.mp = this.mp - 10;
        return 30;
    }

    public int att_B() {
        this.mp = this.mp - 20;
        return 50;
    }

    // public void dmg(int input_dmg) {
    //     this.hp = this.hp - input_dmg;
    // }

    public void dmg(int dmg) {  // 공격
        this.hp = this.hp - dmg;
        System.out.println(this.name+"은" +dmg+ "공격을 받았습니다용.");
    }
    public void dff(int dff) {  // 방어()

        System.out.println(this.name+"은"+dff+ "");
    }
    
    public void info(){
        System.out.println("__________"+name+"__________");
        System.out.println("HP = "+this.hp);
        System.out.println("MP = "+this.mp);

    }
}
