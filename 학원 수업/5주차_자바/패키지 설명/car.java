import Package.*;

class car{
    public static void main(String[] arg) {
    
        //인스턴스 생성
        Car myCar = new Car();
        // 계획  = 구현 (주소가 같고 타입이 같아야지 마이카가 카라고 데이터를 불러올 수 있음)
        // stack = heap
        // 그저 타입만 선언 = 구현
        Car anotherCar = new Car();
        //하위 폴더의 Car를 가져옴
        //heap 에 추가가됨

        //인스턴스의 내용 출력
        System.out.println(": " + myCar.company);
        System.out.println(": " + myCar.model);
        System.out.println(": " + myCar.color);
        System.out.println(": " + myCar.maxSpeed);
        System.out.println(": " + myCar.speed);
        //필드 데이터 값

        //인스턴스의 값 출력
        myCar.speed = 60;
        //대입해도 하위 폴더 내용은 변하지않음
        System.out.println("myCar " + myCar.speed);
        System.out.println("myCar " + anotherCar.speed);

        int check = myCar.speedCheck();
        System.out.println("this speed = "+check);
        // System.out.println("this speed = "+Calc.calcTest(check));
        //heap에 구현을 한 적이 없는데 되는 이유는 static(이미 존재구현이 되있음)
    }
}