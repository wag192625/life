package CheckPrint;

import driver.Beginner;
import driver.Driver;
import driver.Expert;

public interface CheckPrint {
    final Beginner beginner = new Beginner();
    //final을 사용하여 값이 변하지 않도록 함
    final Expert expert = new Expert();

    static enum city {천안, 서울};
    static enum highway {고속도로};
    // enum은 열거형 상수, 이넘을 대체 왜 쓰는가????????????

    /*ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ필드ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ*/

    static int getLimitSpeed(Driver input_Driver) { //인풋 드라이버를 쓰는 이유
        if(input_Driver instanceof Expert) {    // Driver 인터페이스의 현재 타입이 Expert와 같다면
            return input_Driver.getSpeed();     // Expert의(여기서는 input_Driver) getSpeed 출력
            //여기서의 get 은 getter가 아니라 그저 변수명임
        }else if(input_Driver instanceof Beginner){
            return input_Driver.getSpeed();
        }
        return 0;
    }
    static String viewLocation(String location) {   //로케이션을 쓰는 이유
            // 메인 메소드에서만 출력함
        for (city c : city.values()) {
            if (c.name().equals(location)) {
                return "도시 안 입니다.";
            }
        }
        for (highway h : highway.values()) {
            if(h.name().equals(location)) {
                return "고속도로 입니다.";
            }
        }
        return "이동 중이 아닙니다.";
    }

    static Driver fixDriver(String location) {
            // 메인 메소드에서만 사용중
        for (city c : city.values()) {  //이넘을 써서 열거 타입인 벨류를 쓴 것인가?
            if (c.name().equals(location)) {    //배열이기에 이퀄스를 쓴 것인가?
                System.out.println("드라이버" + beginner.getClass().getName()+"모드로 변경합니다.");
              return beginner;   //  ~~.getClass().getName() 쓴 이유는 이렇게도 쓸 수 있다 라는 것을 보여주기 위함
                //비기너로 리턴
            }
        }
        for (highway h :highway.values()) {
            if (h.name().equals(location)) {
                System.out.println("드라이버" + expert.getClass().getName()+"모드로 변경합니다.");
                return expert;
            }
        }
        System.out.println("알 수 없는 위치로" + beginner.getClass().getName()+"모드로 변경합니다.");
        return  beginner;
    }
}