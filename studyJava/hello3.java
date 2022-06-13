import java.util.ArrayList;

class hello3 {
    public static void main(String[] arg){
    //void 리턴을 안하겠다.
    // 시작점
    // (String[] [] 붙어서 문자열만 받겠다. arg) 통로라 생각 
    //
        System.out.println("programmers start!");
    // print 만 할 경우 줄바꿈이 안된다.
    // ln을 찍으면 한줄 띄어쓰기
        ArrayList<String> inputArray = new ArrayList<String>();
        //변수명 =new 가 붙으면 새로 만든다. 타입은 동일하게 해야 에러 안남.
        //  () 붙은 이유는 구분하기 위하여
        
    // String 문자열,   배열은 고정
        //메모리에 스트링 배열일 경우는 그 크기가 고정이기 떄문에
        // 다른 연결은 끊어준다.
        // length (고정이라 괄호 안씀)
        // equals를 통해 값을 비교
    // String buffuer   배열은 가변 
        // length()
    // ArrayLIst       가변
        // sizw()
        // ArrayList<string>    string만 들어갈 수 있음
        inputArray.add("Jane");
    // add 는 안의 값을 순차적으로 넣겠다.
        inputArray.add("Kim");
    // 0번째 배열은 Jane 1번째는 Kim
        System.out.println(solution(inputArray));
    // 출력
}
    public static String solution(ArrayList<String> inputArray){
        System.out.println(inputArray.size());
        String answer = "";

        String[] array_name = new String[3];
        array_name[0]="Kim";
        array_name[1]="Park";
        array_name[2]="Yi";
        System.out.println(inputArray.size());
        //seoul 배열을 순회해서 kim의 위치 찾기
        for(int i = 0; i< inputArray.size(); i++) {
            //if(name[i].equals("Kim"))
            if(inputArray.get(i) == "Kim"){
                System.out.println("ok");
            }
            //검색 추천 문장 : java 값 비교 (주소비교, 값비교)
            //equals
            //위치 저장
        }

        StringBuffer text_test = new StringBuffer("hellow");
        text_test.append("abc");
        text_test.append("abc");
        System.out.println(text_test.length());
        // "김서방은 [배열위치]에 있다" (string 불변성)
        // answer = 김서방 + [배열위치] + 에 있다.
        // 스트링 버퍼는 어레이 리스트 속성으로 들어가서 순차적
        // 메모리 생성 주기를 최소한으로 만들기 위해 빈번한것은 버퍼
        // 고정해야 하는 값 같은건 그냥 스트링
        return answer;
    }
}