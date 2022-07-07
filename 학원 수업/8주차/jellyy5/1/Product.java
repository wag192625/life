package javaproject.example1;

public class Product implements Action, Taste {
    
    private String name;
    private TASTE taste;
    private ACTION action;

    public Product(String name) {
        this.name = name;
    }

    public Product(Product product) {
        this.name = product.name;
    }

    public Product setTaste(TASTE taste) {
        this.taste = taste;
        return this;
    };
    public Product setAction(ACTION action) {
        this.action = action;
        return this;
    };

    @Override
    public void eat() {

        if(this.taste != null) {
            String taste = this.getTaste(this.taste);
            System.out.print(taste + "맛 ");
        }
        String action = this.getAction(this.action);
        System.out.println(this.name + "을(를) " + action);
    }

    @Override
    public void choice() {
        String taste = this.getTaste(this.taste);
        System.out.println(taste + "맛 " + this.name + "을(를) 선택합니다.");
    }
}
