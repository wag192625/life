public class AnonymousMain {
    public static void main(String[] args){

        //1. 필드 값으로 익명객체 사용
        Anonymous anonymous_1 = new Anonymous();
        anonymous_1.field.wake();
        anonymous_1.field.run();

        System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
        //2. 메소드(지역변수)로 익명객체 사용
        anonymous_1.method1();

        System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
        //3. 매개변수로 익명객체 사용
        
        anonymous_1.method2(
                new Person(){
                        //오버라이딩 전에는 부모클래스의 매개변수 실행
                    @Override
                    void wake() {
                        System.out.println("11시에 일어났습니다.");
                    }
            }
        );
    }
}