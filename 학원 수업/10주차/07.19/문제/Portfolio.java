package 문제;

import java.util.Scanner;

public class Portfolio {
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
//        List list =new List();
//        ArrayList<String> array = new ArrayList<>();

//        String input = "";
//            input = sc.nextLine();
//            array.add(input);
        System.out.println("프론트엔드는 누구입니까?");

        Part part = new Part();
        Part.Frontend frontend = part.new Frontend();
        //중첩 클래스 이용 시 먼저 상위 클래스 선언 후 하위 클래스에 상위 클래스 변수명 입력 후 입력
        String input ="";
        input =sc.nextLine();
        frontend.(input);



        System.out.println("백엔드는 누구입니까?");
        System.out.println("DB는 누구입니까?");
        System.out.println("프로젝트 매니저는 누구입니까?");
        }

}
