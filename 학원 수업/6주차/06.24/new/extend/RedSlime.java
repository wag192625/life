package extend;
//extends를 통해 NomalSlime의 데이터를 물려받았습니다.(상속)
public class RedSlime extends NomalSlime{

  public String color;

    public RedSlime(int hp, int mp, String color, String name) {
        this.hp = hp;
        this.mp = mp;
        this.name = name ;
        this.color = color;
    }
    public void getColor() {
      System.out.println("이 슬라임의 색상은 " + this.color+ "입니다.");
    }
  }  
