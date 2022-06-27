package exam_overriding;

public class Computer extends calculator{
    @Override
    double areaCircle(double r) {
        System.out.println("Calculator 객체의 areaCircle() 실행");
            return Math.PI * r * r;
    }
}
