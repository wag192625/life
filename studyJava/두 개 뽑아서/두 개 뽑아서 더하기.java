/*문제 설명
정수 배열 numbers가 주어집니다. numbers에서 서로 다른 인덱스에 있는 두 개의 수를 뽑아 더해서 만들 수 있는 모든 수를 배열에 오름차순으로 담아 return 하도록 solution 함수를 완성해주세요.

제한사항
numbers의 길이는 2 이상 100 이하입니다.
numbers의 모든 수는 0 이상 100 이하입니다.
입출력 예
numbers	result
[2,1,3,4,1]	[2,3,4,5,6,7]
[5,0,2,7]	[2,5,7,9,12]
입출력 예 설명
입출력 예 #1

2 = 1 + 1 입니다. (1이 numbers에 두 개 있습니다.)
3 = 2 + 1 입니다.
4 = 1 + 3 입니다.
5 = 1 + 4 = 2 + 3 입니다.
6 = 2 + 4 입니다.
7 = 3 + 4 입니다.
따라서 [2,3,4,5,6,7] 을 return 해야 합니다.
입출력 예 #2

2 = 0 + 2 입니다.
5 = 5 + 0 입니다.
7 = 0 + 7 = 5 + 2 입니다.
9 = 2 + 7 입니다.
12 = 5 + 7 입니다.
따라서 [2,5,7,9,12] 를 return 해야 합니다.
*/
import java.util.ArrayList;
import java.util.TreeSet;

class Solution {

  public static void main(String[] arg) { //이거는 정석이라고 생각하고 쓰자 S
    int[] numbers = {1,2,3,4,5,6};
    solution(numbers); // 아래 메소드에서 가져옴. 맞나? S
  }// 추가

  public static int[] solution(int[] numbers) {
  //스태틱이 아니라 int[]면 뭘까?          //정수만 받겠다[배열선언] / 값이 들어오는 통로
    int[] arr = numbers;  
    int sum = 0; // S
    int[] answer = {}; // 최종 값 배열
      // 배열 두개씩 각각 합한 후
      // 중복값을 제거 후 오름차순 해야함
    ArrayList<Integer> arrayListTest /* S */ = new ArrayList<Integer>();
                      //아래 for문에 넣어봄
    // ArrayList<Integer>  = new ArrayList<Integer>();
      //이걸 왜 쓰는지 몰루
      // 아직 자바의 주소값에 대한 이해가 부족함.

    // 합의 메소드 생성
    for(int i=0; i < arr.length; i++) {
      for(int j=i+1; j < arr.length; j++){
        // sum += j + i;
        sum += numbers[i] + numbers[j];
        arrayListTest.add(sum);     // 다른조 이 줄 추가했길래 함 써봄
      }
      //더한 값을 집어넣을 변수 하나 만들어야함 -> sum으로 만듦
      }
    System.out.println();
    // 중복값 제거 메소드
    // Treeset 쓰면 기본적으로 오름차순 해서 중복 제거해준다 함.
    // public  void wq(int[] numbers){
    //   int[] list = [];
    //   TreeSet<Number> treeSet = new TreeSet<>();
    //   for(numbers item : list){
    //   treeSet.add(item);
    //  }//arr을 집어넣어야함
    // }
    //
    //오름차순 메소드 후 리턴
    //Treeset 씀
    return answer;
  }
}