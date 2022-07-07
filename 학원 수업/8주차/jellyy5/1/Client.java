package javaproject.example1;

import javaproject.example1.Taste.TASTE;

public class Client {
    
    public static void main(String[] args) {
        
        Product milk = new Milk(TASTE.MANGO);

        Product sogogi = new Product("소고기")
                .setAction(Action.ACTION.CHEW);

        Person inguk = new Person("인국");



        inguk.setProduct(sogogi).eat();
//        milk.eat();
//
//        sogogi.eat();
//        new Person("인국").setProduct(milk).eat();
        
    }
}
