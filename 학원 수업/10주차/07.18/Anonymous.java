//P.404
public class Anonymous {

    // 필드로 익명객체 사용법
    Person field = new Person() {
    //익명 객체 : 한번 쓰고 버리는 객체
        int fieldInt;
        @Override
        void wake() {
            fieldInt = 9;
            System.out.println("늦잠 자서 7시에 일어납니다.");
            System.out.println(fieldInt+"시 까지 달려가야 합니다.");
            work();

        }
        private void work() {
            System.out.println("늦잠 잤다, 뛰어가야지!");
        }
    };

    void method1() {
    //void method1(int inputInt) {
        //매개변수(인자값 혹은 전역변수의 라이프사이클에 따라 살아있다.

        //지역변수 ( 메서드의 라이프사이클에 따라 변수가 활용(살아있다)
        //int outputInt;
        
        //익명객체의 라이프 사이클 start
        Person localVar = new Person() {
            @Override
            void wake() {
                //fieldInt = 10; 필드값은 접근할 수 없다. (부모 타입에 선언된것만 사용 가능)
                System.out.println("늦잠 자서 10시에 일어납니다.");
                work();

            }
            private void work() {
                System.out.println("학생들을 가르치는 교사입니다!!!!");
            }
        };
        // 익명 객체의 라이프 사이클 end
        localVar.wake();//로컬 바라는
    }

    void method2(Person person_1){
        person_1.wake();
    }
}
