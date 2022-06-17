import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.HashSet;
// import java.util.TreeSet;

public class aaaa {
  public static void main(String[] arg) { //이거는 정석이라고 생각하고 쓰자 S
    int[] numbers = {5,0,2,7} ;
    // 변수 명은 뒤의 변수와 비슷한 의미로 씀
    int[] answer = solution(numbers) ; // 아래 메소드에서 가져옴. 맞나? S
    // 배열은 한번 사이즈가 정해지면 더이상 늘릴수도  업승ㅁ
    // 5 0 2 7 에서 절대 변경안됨 
    for(int i = 0; i<answer.length; i++){
    System.out.println(answer[i]);
    
    //최종값이라 맨 아래 부분 <----------다시 설명
    //포 문이 실행될 때 배열이 [] 들어간다 생각하라
    //시스템 아웃은 아직은 내가 보면서 써야한다.
    }
  }
  //메인 함수는 되도록 적게 쓰는게 (핵심적인것만) 쓰는게
  
  public static int[] solution(int[] numbers) {
  // void 자리에 리턴 타입을 가지기에 int[] 
  // numbers 써도 됨(메인은 안됨) 리턴 타입을 결정해주는것
  // void 타입이면 상관 없는데 int[] 값이 변하는 상태라 스태틱 사용(maybe)
  // 스태틱은 인트라는 항목 있어서 리턴이 있기 때문에 메모리  
    List<Integer> list = new ArrayList<Integer>();
  // ㄴ 리스트함수<정수타입> 변수명 = new 어레이리스트라는 함수 타입<배열이 안됨>
  // 함수 뒤에는 () <- 무조건 붙음
  // new 함수를 새로 선언하기 위해 가져옴
  // List는 모듈을 무조건 가져와야함

  //정수형 리스트를 선언하기 위해 사용/ 함수이름은 어레이 리스트 매개변수같은 인티저
    int[] array = numbers;
    int sum = 0; // S
    //ArrayList<Integer> arrayListTest /* S */ = new ArrayList<Integer>();문에 넣어
    for(int i=0; i < array.length-1; i++) {
      // -1 붙은 이유 악수를 마지막으로 한 사람은 모든 사람과 악수를 이미 했다.
      for(int j=i+1; j < array.length; j++){
        list.add(array[i]+array[j]);
      }
    }

    Set<Integer> set = new HashSet<Integer>(list);
    //
    List<Integer> ans = new ArrayList<Integer>(set);
    //리스트는 리턴할 수 없어서 일부로 배열화로 해준다. (동현이 동생은 할 수 있는데 동현이가 )
    int[] answer = new int[ans.size()];
    //ans는 List 타입이라 length 가 안먹힘
    for(int a = 0;a<ans.size(); a++){
      answer [a] = ans.get(a);
    //answer로 출력해야 하니 ans의 값을 가져와 answer에 대입
    }
    System.out.println();
  
    return answer;


    // int[] as = {1,2,3};
    // system.out.println(as); 이런식으로 쓰면 안됨
    // 출력을 할 때 배열의 이름을 출력하면 안됨
    // 배열은 
    
  }
}

// 메인 은 보이드를 쓴다.
// 보이드 써서 리턴 엔서 안쓰고 시스템 프린트를 씀

// 뉴 는 새로운 모듈을 가져온다
// 자바의 특징= 사이즈가 정해진 상태로 

