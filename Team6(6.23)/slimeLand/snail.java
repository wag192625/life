package June21.Team6.slimeLand;

public class snail {
    //필드값 (슬라임의 hp, mp ...)

    public String name;
    public int hp;
    public int mp;

    //생성자(슬라임 클래스를 인스턴스로 만들 때 매개변수를 받아서 객체 만들기)
    public snail() {
        this.name = "달팽이";
        this.hp = 5;
    }

    public snail(String input_name, int input_hp, int input_mp) {
        this.name = input_name;
        this.hp = input_hp;
        this.mp = input_mp;
    }

    public void dmg(int dmg) {
        System.out.println("용사는 "+ dmg +"의 공격을 했습니다.");
        this.hp -= dmg;
        System.out.println(this.name + "은 " +dmg+ "의 공격을 받았습니다.");
    }

    public int att() {
        return 1;
    }

    public void info() {
        System.out.println("_______"+name+"________");
        System.out.println("HP = " + this.hp);
    }
}
