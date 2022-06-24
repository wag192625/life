import extend.*;
import inven.potion.*;

public class main {
    
    public static void main(String[] arg) {

        // SlimeGO();
        usePotion();
    }

    private static void usePotion() {
        RedPotion redpotion = new RedPotion(30, 1);
        RedPotion redpotion_x3 = new RedPotion(30, 3);

        redpotion.usePotionText();
        int effectHP = redpotion.useItem(20);
        int effectHP_x3 = redpotion.useItem(41);

        System.out.println("용사는 포션을 사용하여 HP "+effectHP+"를 회복하였습니다.");
        System.out.println("용사는 포션을 사용하여 HP "+effectHP+"를 회복하였습니다.");
    }
    private static void SlimeGO() {
        RedSlime redslime = new RedSlime(20, 30, "red", "예쁜이");

        redslime.initSlime();
        redslime.getColor();

    }
}