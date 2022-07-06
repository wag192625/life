package exam01_field_polymorphism;


public class Number02_break implements Break, Pedal{
    public void push() {
        System.out.println("number02 브레이크 실행");
    }
    public void stop() {
        System.out.println("number02 브레이크 실행");
    }
}