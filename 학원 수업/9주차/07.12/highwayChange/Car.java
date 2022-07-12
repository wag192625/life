package highwayChange;

import highwayChange.driver.Beginner;
import highwayChange.driver.Driver;

public class Car {
    private Driver driverType;
    //드라이버 타입은 외부로 노출 시키지 않겠다.
    public Car() {
        driverType = new Beginner();
    }   //처음 타입을 뉴 비기너로 설정 (드라이버 타입 앞에 클래스를 안붙이 이유는?)
    
    public void setDriver(Driver input_driver) {
        //체크프린트 
        driverType = input_driver;
        System.out.println("드라이버가 교체 되었습니다 : " + driverType.getClass().getName());
    }
    public Driver getDriver() {
        return driverType;
    }
}
