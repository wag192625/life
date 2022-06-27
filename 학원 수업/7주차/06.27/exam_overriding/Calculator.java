package exam_overriding;

public class calculator {
    double areaCircle(double r) {
        System.out.println("Calculator 객체의 areaCircle() 실행");
            return Math.PI * r * r;
    }
}