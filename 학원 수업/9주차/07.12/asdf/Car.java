
import driver.Beginner;
import driver.Driver;

public class Car {
    private Driver driverType;
    //드라이버 인터페이스를 가져와서 이름 변경/ 필드를 만듦!!!
    public Car(){
        driverType = new Beginner();    //필드에 클래스를 지정?
    }
    public void setDriver(Driver input_driver){
        driverType = input_driver;
        System.out.println("드라이버가 교체 되었습니다." + driverType.getClass().getName());
        //
    }
    public Driver getDriver(){
        return driverType;
    }
}
