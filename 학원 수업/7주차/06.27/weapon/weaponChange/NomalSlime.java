
public class NomalSlime {
    
    public int hp;
    public int mp;
    public int exp;
    public String name;
    public String color;


    public void initSlime() {
        System.out.println(this.name+" 슬라임이 태어났습니다.");
    }

    public String getName() {
        return this.name;
    }

    public int att() {
        return 10;
    }
}