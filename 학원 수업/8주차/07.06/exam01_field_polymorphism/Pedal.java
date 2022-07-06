package exam01_field_polymorphism;

public interface Pedal {
    public void push();

    default void defaultmethod_install_pedal(Pedal abc){
//        패달 타입을 매개변수로 하여
        if(abc instanceof HankookTire) {
            System.out.println("한국 타이어 세팅으로 변경합니다.");
        } else if (abc instanceof KumhoTire) {
            System.out.println("금호 타이어 세팅으로 변경합니다.");
        } else if (abc instanceof newHankookTire) {
            System.out.println("새로운 한국 타이어 세팅으로 변경합니다.");
        }
    }
}
