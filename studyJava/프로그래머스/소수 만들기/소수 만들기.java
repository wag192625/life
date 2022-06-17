import java.util.*;
class Solution {

    public int solution(int[] nums) {
    // int[] nums = {1,2,3,4,5,6,7,8};
    int answer = 0;

        for(int i = 0; i<nums.length-2; i++) {
            for(int j = i+1; j<nums.length-1; j++) {
                for(int k = j+1; k<nums.length; k++) {
                    int sum = (nums[i] + nums[j] + nums[k]);
                    //3개의 수를 더해야 해서 for문 3개 사용
                    // System.out.println(sum);
                        for(int l=2; l<sum; l++){
                            //2로 먼저 나누기 위해 설정
                            //왠지 모르겠지만 2가 아니라 3으로 해도 모두 통과
                            if(sum%l == 0 ){
                                break; //sum과 l을 나눈 값의 나머지가 0이면 
                            }
                            if(l==sum-1){
                            // l 값이 sum에 -1을 한 값과 같다면 answer값에 추가를 해준다.
                                answer++;
                            }
                        }
                    //     if(b(sum)){
                    //         answer++;
                    // }
                }
            }
        }
        return answer;
    }
    // public static boolean b(int num){
    //     for(int i = 2; i < num; i++){
    //         if(num % i== 0)return false;
    //     }
    //     return true;
    // }
}