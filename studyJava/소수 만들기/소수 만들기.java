import java.util.*;

class Solution {
    public static void main(String[] arg) {
        // int[] num = {1,2,3,4,5,6};
        // solution(num)
    }
    public int solution(int[] nums) {
    int[] numbers = {1,2,3,4,5,6,7,8};
    // int n = numbers;
    int answer = 0;
    // boolean[] isPrime = new boolean[n+1];
    // Arrays.fill(isPrime , true);
    // isPrime [0] = isPrime [1] = false;
        for(int i = 0; i<numbers.length-2; i++) {
            for(int j = i+1; j<numbers.length-1; j++) {
                for(int k = j+1; k<numbers.length; k++){
                    int sum = (numbers[i] + numbers[j] + numbers[k]);
                        for(int z = 2; z<sum; z++){
                            if(sum % z == 0)
                                answer++;}
                }
            }
        }
        return answer;
    }
}