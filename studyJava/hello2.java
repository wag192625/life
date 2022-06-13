// 김서방 찾기

/*class hello2 {
    public static void main(String[] arg) {
        System.out.println("programers start!");
        
        String inputText = "text input";
        System.out.println(solution(inputText));
    }

    public static String solution(String text) {
        String answer = text;
        return answer;
    } //메소드 생성됨
} */


/*
import java.util.ArrayList;

class hello2 {
    public static void main(String[] arg) {
        System.out.println("programers start!");
        

        String[] inputText = {"Jane", "Kim"};
        ArrayList<Integer> inputArray = new ArrayList<Integer>();
        
        System.out.println(solution(inputArray));
    }

    public static String solution(ArrayList<Integer> seoul) {
        String answer = "";
        return answer;
    } //메소드 생성됨
}
*/


import java.util.ArrayList;

class hello2 {
    public static void main(String[] arg) {
        System.out.println("programers start!");
        

        String[] inputText = {"Jane", "Kim"};
        ArrayList<String> inputArray = new ArrayList<String>();
        inputArray.add("jane");
        inputArray.add("Kim");
        // System.out.println(solution(inputArray));
        // inputArray.set(0, "June");
        // System.out.println(inputArray);
        System.out.println(solution(inputArray));
        
    }

    public static String solution(ArrayList<String> seoul) {
        System.out.println(seoul.size());
        String answer = "";
        // seoul 배열을 순회해서 Kim의 위치 찾기
        for(int i = 0; i < seoul.size(); i++) {
            if(seoul.get(i) == "Kim") {
            // if(seoul.get(i).equals("Kim")) {
                System.out.println("ok");
                
            }
            // java 에서는 == 
            // call by~~
            // java 값 비교 (주소 비교, 값 비교)

            //eq
            //위치 저장
        }
        // StringBuffer text_test = new StringBuffer("hellow");
        // text_test.append("abc"); //
        // System.out.println(text_test);

        // "김서방은 [배열 위치]에 있다."
        // answer = 김서방은 + [배열 위치] + 에 있다.
        return answer;
    } //메소드 생성됨
}


//String 불변성 (고정값)
// 한번 정해지면 문자열,갯수 고정이어서
//String A  주소값과 메모리 주소값이 있는데
// 주소값에 hellow 메모리 주소값에 hellow 할당을 해줬을때
// 주소값에 있는 문자열은 변하지 않는다. 
// 뒤에 다른 문자 등을 붙이려면 주소값을 없애고 (+abc)
// 메모리 주소값에 적용을 한다. (hellowabc)
// 이후 메모리 주소값을 지우고 주소값으로 적용


//String buffer (각각 하나 할당)
//str = [H][E][L][L][O][W]
//      ArrayList