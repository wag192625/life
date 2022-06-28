import package0008.*;

public class main {
    public static void main(String[] arg) {
        
        startSandwich();
    }

    private static void startSandwich() {
        // childClass_sandwich_anotherPacjage[] sandwich;
    }


    ////
    private static void startPromotion() {
        child child = new child();
        parent parent= child;
        // 부모일때만 가능. 다른 객체를 넣을 수 있다.
        // parent.method 1 2는 parent 타입. 3은 없어서 자식타입
        parent.method1();
        parent.method2();
        parent.method3();
        // 타입에서 메서드3를 인식을 못함. 왜냐
        // 패런트의 타입 기준으로 차일드의 메서드와 필드값을 조사.
    }
}