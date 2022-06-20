import computer1.*;
//computer 폴더에서 불러옴
import java.util.Scanner;

public class main{
    public static void main(String[] arg) {;
        //메인 문자열 선언
    Scanner input = new Scanner(System.in);
    //Scanner 클래스 사용시 System.in을 사용해야 입력한 값을 읽을 수 있음

    // System.out.println("cpu");    //입력
    // String inputM1cpu = input.nextLine();
    
    // System.out.println("ram");    //입력
    // String inputM1ram = input.nextLine();
    
    // System.out.println("ssd");    //입력
    // // ㄴ 입력창. 입력하면
    // String inputM1ssd = input.nextLine();
    
    book abc = new book(/* inputM1cpu, inputM1ram, inputM1ssd */);
    // 패키지 메소드와 동일한 이름

    System.out.println(abc.modelName);
    System.out.println(abc.cpu);
    System.out.println(abc.ram);
    System.out.println(abc.ssd);
    // ~() 처럼 공백으로 입력시abc로 지정한 패키지 내 입력값 출력
    // 
    }
}