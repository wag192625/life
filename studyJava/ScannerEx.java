// import java.util.Scanner;
// Scanner a = new Sacnner(System.in);

import java.util.Scanner; // import 객체
// 자바라는 객체 안에 스캐너가 있는데 이것을 불러오겠다.
// 
public class ScannerEx { // vs코드에서 main 사용 함수명이랑 파일 이름이랑 같이하면 안됨
    //스캐너라는 클래스의 구조로만 만들 수 있음
    public static void main(String args[]) { // 주소 순서대로 읽음
        System.out.println("이름, 도시, 나이, 체중, 독신 여부를 빈칸으로 분리하여 입력하세요.");
        Scanner scanner = new Scanner(System.in);
        // Scanner abc abc는 스캐너만 받을 수 있다
        // =type   abc    
        // new는 인스턴스. 인스턴스는 실제 메모리에 고유 영역을 가짐
        // new = 새로 만들겠다. 새롭게 구조를 만들겠다.
        // Scanner(System.in);는 Scanner설계도에 인자값으로 System.in을 갖겠다. 
        
        // 스캐너는 타입 (객체 타입으로도 가능)

        // (System.in)인자값.=통로=객체
        // 지금 상황에선 타이핑한 내용(입력값)을 전달. 

        String name = scanner.next(); // 문자열 읽기
        // 스트링이라는 타입으로 네임이라는 변수를 선언
        // 에 대입 연산자를 넣어 scanner.next()이라는 것을 대입하겠다.
        // next라는 메소드를 실행 
        // 모르겠다.
        // println print 
        System.out.print("이름은" + name + ", ");
        
        String city = scanner.next(); // 문자열 읽기
        System.out.print("도시는" + city + ", ");
        
        int age = scanner.nextInt(); // 점수 읽기
        System.out.print("나이는" + age + "살, ");
        
        double weight = scanner.nextDouble(); // 실수 읽기
        System.out.print("체중은" + weight + "kg, ");

        boolean isSingle = scanner.nextBoolean(); // 논리값 읽기
        System.out.println("독신 여부는" + isSingle + "입니다.");

        scanner.close(); // scanner 객체 닫기
    }
}
