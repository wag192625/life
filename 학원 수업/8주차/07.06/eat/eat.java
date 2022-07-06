package eat;

import java.util.Scanner;

public class eat {
    public static void main(String[] arg){
        eatting();
    }

    public static void eatting(){
        Scanner sc = new Scanner(System.in);

        mango mango = new mango();

        System.out.println("------");
        String input = "";
        input=sc.nextLine();
        if(input == "mango"){
            System.out.println("망고");
        } else {
            System.out.println("아무것도 고르지 않았습니다.");
        }
    }
}

//  사람은 한 클래스에 각각 만들기
//  추상메서드로 젤리 묶고 필드로 맛 별로 구별
//  선택과 먹는거는 어떻게?
//  nextLine 써서 사람,선택
//  public void eat() {
//      if( = 1){
//          System.out.println("딸기 젤리");
//      } else if() ~~~~~


//  여러사람이 젤리를 먹는 행위 :
//  여러 사람이 한가지 메소드 사용, 생성자 스태틱...
//  하나의 자식클래스가 여러가지 일을 하는 (다중 상속) 것을 쓰기
//  젤리 중 (하나의 변수) 망고 포도 딸기 (바꿀 수 있는 부분 :필드)
//  필드 바로 접근하면 보안성 문제, 접근제한자 쓰기

//