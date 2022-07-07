package javaproject.example1;

public class Milk extends Product {
    
    public Milk(TASTE taste) {
        super("우유");
        this.setTaste(taste);
        this.setAction(ACTION.DRINK);
    }
}
