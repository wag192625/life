package exam01_field_polymorphism;


public class Number01_break implements Break,Pedal {
    public void stop() {
        System.out.println("number01 브레이크 실행");
    }
    public void push() {
        System.out.println("number01 패달 실행");
    }
}