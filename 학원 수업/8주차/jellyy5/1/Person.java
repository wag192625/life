package javaproject.example1;

public class Person implements Action, Taste {
    
    private String name;
    private Product product;

    public Person(String name) {
        this.name = name;
    }

    public Person setProduct(Product product) {
        this.product = product;
        return this;
    }

    @Override
    public void eat() {
        System.out.print(this.name + "이(가) ");
        this.product.eat();
    }

    @Override
    public void choice() {
        System.out.print(this.name + "이(가) ");
        this.product.choice();
    }


}
