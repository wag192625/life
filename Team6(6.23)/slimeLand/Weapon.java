package June21.Team6.slimeLand;

public class Weapon {
    public String name;
    public int offpower;

    public Weapon(String input_name, int input_offpower) {
        this.name = input_name;
        this.offpower = input_offpower;
    }

    public void info() {
        System.out.println("----------------------");
        System.out.println("무기 = " + this.name);
        System.out.println("공격력 = " + this.offpower);
        System.out.println("----------------------");
    }
}
