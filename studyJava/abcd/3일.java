import java.util.*;
//콜 바이 벨류, 레퍼런스
//커버리지코드

// 5장
// 1.데이터 타입

class Solution {
    public static void main(String[] arg) {
    System.out.println("test");
    
    // 배열의 주소값
    int[] arr = null;
    int[] arr_11 = null;
    arr = new int[3];
    arr_1 = new int[3];
    System.out.println(arr);
    System.out.println(arr_1);
    // 배열의 복사와 주소값
    int[] arr = {100, 200, 300};
    int[] arr = null;
    //배열로 선언된 변수끼리 대입연산자
    //배열 주소를 대입한다.
    arr3 = arr1;
    System.out.println("arr_3: " + arr3);
    arr3[0] = 400;    
    System.out.println("arr_3: " + Arrays.toString(arr1));
    System.out.println("arr_3: " + Arrays.toString(arr3));
    arr3[0] = 900;    
    System.out.println("arr_3: " + Arrays.toString(arr1));
    System.out.println("arr_3: " + Arrays.toString(arr3));
    // 주소는 같은 = heap에 있는 내용이 같다.
    
    int[] arr1 = {100,200,300};
    System.out.println("arr1: " + arr1);

    int[] arr2 = null;
    System.out.println("arr2: " + arr2);
    System.out.println(Arrays.toString(arr2));

    arr1 = Arrays.copyOf(arr1, arr1.length);
    System.out.println(Arrays.toString(arr2));
    

    //string 주소
    String str1 = "AAA";
    String str2 = "AAA";
    System.out.println(str1 == str2);
    System.out.println(str1.equals(str2));

    String str3 = "asfsgahnjdnsbjndjnsjf";
    String str4 = "asfsgahnjdnsbjndjnsjf";
    System.out.println(str3 == str4);
    System.out.println(str4.equals(str3));

//    String name1 = "name1";
//    String name1 = new
//    System.out.println(name1);
//    System.out.println(System.identityHashCode(name1));
//    System.out.println(name2);
//    System.out.println(System.identityHashCode(name1));
    }
}