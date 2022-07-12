package highwayChange;

import highwayChange.check.CheckPrint;
import highwayChange.driver.Beginner;
import highwayChange.driver.Expert;

public class main {
    public static void main(String[] arg) {
        String[] goway = {"천안", "고속도로", "고속도로", "고속도로", "서울", "알수없음"};
        //goway 라는 배열로 만들어 순차적으로 나오게 설정
        Car startCar = new Car();
        //
        highwaySimulation(startCar, goway);
        //아래 메소드 실행
    }

    private static void highwaySimulation(Car startCar, String[] goway) {
        //highwaySimulation에 카 메소드와 스트링 배열 메소드를 넣은 
        for(String index : goway) { //메인 메소드의 goway 배열을 순차적으로 적용
            System.out.println("현재 위치는 "+index+"입니다");
            System.out.println(CheckPrint.viewLocation(index));
            ;
            startCar.setDriver(CheckPrint.fixDriver(index));   //인스턴스 안에 인스턴스
        //  (       2         )(            1             ) 1을 읽고 2를 
            System.out.println("[현재 최고 속도는]");
            System.out.println(CheckPrint.getLimitSpeed(startCar.getDriver()));
            System.out.println("[입니다]");
        }
    }
}
