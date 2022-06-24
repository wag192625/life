package inven.potion;

public class RedPotion extends Potion{
    //포션의 효과 증폭 수치
        public int effect;

    //포션을 생성할 때 효과 수치를 받음
        RedPotion(int hp, int effect) {
            this.effectHP = hp;
            this.effect = effect ;
        }

        public int usePotion(int invenUseNumber) {
            int result = effectHP * effect;
            return result;
        }
}
