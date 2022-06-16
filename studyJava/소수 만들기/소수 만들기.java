import java.util;

class Solution {
    public static void main(String[] arg) {
        // int[] num = {1,2,3,4,5,6};
        // solution(num)
    }
    public int solution(int[] nums) {
    int[] numbers = {1,2,3,4,5,6,7,8};
    int n = numbers;
    int answer = 0;
    boolean[] isPrime = new boolean[n+1];
    Arrays.fill(isPrime , true);

        isPrime [0] = isPrime [1] = false;
        for(int i = 0; i<numbers.length-2; i++) {
            for(int j = i+1; j<numbers.length-1; j++) {
                for(int k = j+1; k<numbers.length; k++){
                    int sum = (numbers[i] + numbers[j] + numbers[k]);
                    if(sum % 2 == 0){ // 2로 나누어 떨어지면 (약수도 포함됨)
                        if(sum )// 약수 제거 문제
                        answer++; //결괏값 0나옴
                    }
                }
            }
        }
        return answer;
    }
}
    //if(소수이면 );
    // public boolean sum(int n){
    //     if(n == 1) return false;
    //     else if(n == 2) return true;
    //     else if(n % 2 == 0) return false;

    //     int count = 0;
    //     for(int i = 3; i <= Math.sqrt(n); i += 2) {
    //         if(sum % i == 0){
    //             count++;
    //         }
    //     }
    // }
    // }