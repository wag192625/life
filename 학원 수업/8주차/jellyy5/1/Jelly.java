package javaproject.example1;

public class Jelly extends Product {

    public  Jelly() {
        super("젤리");
        this.setAction(ACTION.EAT);
    }

    public Jelly(TASTE taste) {
        super("젤리");
        this.setTaste(taste);
        this.setAction(ACTION.EAT);
    }
}
