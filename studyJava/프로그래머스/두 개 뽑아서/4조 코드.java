
import java.util.ArrayList;
import java.util.Array;
import java.util.HashSet;

class Solution {
    public static void main(String[] args) {
        int[] numbers = {2,1,3,4,1};
        solution(numbers);
    }

    public static int[] solution(int[] numbers) {
        HashSet<Integer> answerSet = new HashSet<Integer>();
        int sum;

        for(int i = 0; i<numbers.length; ++i){
            for(int j = i+1; j<numbers.length; ++j){
                sum = numbers[i] + numbers[j];
                answerSet.add(sum);
            }
        int i = 0;
        int[] answer = new int[answerSet.size()];

        for(int num : answerSet) {
            answer[i++] = num;
        }
        }
    }
}
