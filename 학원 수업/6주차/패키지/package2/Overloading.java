public class Overloading {
    //Overloding=매개변수에 의해 필드값이 달라질 수 있음
    public String company = "hyundai";
    public String model;    //매개변수1
    public String color;
    public int maxSpeed;

    public Overloading() {
    //인자값의 갯수에 따라 가져올 수 있는게(스타일이) 달라짐
    }
    public Overloading(String model) {
        this.model = model;
    }   //this = 클래스를 가르킴, 위에서 선언한 것을 지정
    public Overloading(String model, String color) {
        this.model = model;
        this.color = color;
    }
    public Overloading(String model, String color, int maxSpeed) {
        this.model = model;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }
    
}