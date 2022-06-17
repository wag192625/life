//클래스    설계도 (문제의 집합)
//객체      구현할 대상 (클래스 밑의 문장. 수학의 문제 제목)
//인스턴스  설계도를 바탕으로 구현된 구체적인 실체
//          (수학의 문제의 식이라 생각됨. 답은 컴퓨터가 풀 것임)

import java.util.ArrayList;
// import 받아온다
// 주소는 자세히 써야함
// java.util.ArrayList

class hello3 {
// class 설계도
// hello3 선언
    public static void main(String[] arg){
    // 
    // public 접근 허용
    // static 한개만 설정하겠다 (인스턴스 생성 없이 실행한다.)
        //인스턴스 생성 없이 실행한다 라는게 이해안감...
        
    // void 리턴을 안하겠다.
    // main 시작점
    // (String[] 문자열을 나타내는 자료형 [] 붙어서 문자열만 받겠다
    // arg: String 자료형에 대한 변수명
    // (String[] arg)은 통로라 생각

        // System.out.println("programmers start!");
        
    // System.out.println = 화면에 값을 출력하는 용도
    // print 만 할 경우 줄바꿈이 안된다.
    // ln을 찍으면 한줄 띄어쓰기
        ArrayList<String> inputArray = new ArrayList<String>();
        // ArrayList 가변
        // 저버눈 ㄱㅎㅇ건울 마라 손온
        // ㄴ ~~~ 선언
        // 변수명 =new 가 붙으면 새로 만든다. 타입은 동일하게 해야 에러 안남.
        // () 붙은 이유는 구분하기 위하여
        
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
        // size 다음에 () <-이거도 메소드라 함
        String answer = "";

        String[] array_name = new String[3];
        //array_name 고정값 3개
        array_name[0]="Kim";
        array_name[1]="Park";
        array_name[2]="Yi";
        System.out.println(inputArray.size());
        
        //seoul 배열을 순회해서 kim의 위치 찾기
        for(int i = 0; i< inputArray.size(); i++) {
            //if(name[i].equals("Kim"))
            if(inputArray.get(i) == "Kim"){
                //ArrayList랑 같이 생각
                System.out.println("ok");
            }
            //검색 추천 문장 : java 값 비교 (주소비교, 값비교)
            //equals
            //위치 저장
        }

        // StringBuffer text_test = new StringBuffer("hellow");
        // text_test.append("abc");
        // text_test.append("abc");
        // System.out.println(text_test.length());

        // "김서방은 [배열위치]에 있다" (string 불변성)
        // answer = 김서방 + [배열위치] + 에 있다.
        // 스트링 버퍼는 어레이 리스트 속성으로 들어가서 순차적
        // 메모리 생성 주기를 최소한으로 만들기 위해 빈번한것은 버퍼
        // 고정해야 하는 값 같은건 그냥 스트링
        return answer;
    }
}