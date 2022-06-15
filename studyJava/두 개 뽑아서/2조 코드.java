import java.util.*;

class Solution {
    public int[] solution(int[] numbers) {
        int sum = 0;
        ArrayList<Integer>sumList = new ArrayList<Integer>();

        for(int i = 0; i<numbers.length-1; i++) {
            for(int j = i + 1; j<numbers.length; j++){
                sum = numbers[i] + numbers[j];
                if(!sumList.contains(sum)) {
                    sumList.add(sum);
                }
            }
        }
        Set<Integer> set = new HashSet<Integer>(sumList);
        System.out.print(set);
        set.stream().mapToInt(Integer::inValue).toArray();
        Arrays.sort(answer);

        return answer;
    }
}