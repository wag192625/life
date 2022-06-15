import java.util.*;


class Solution {
// public class abcd {
    public static void main(String[] arg) {
        int[] numbers = {2,1,3,4,1};      
        System.out.println(solution(numbers));
    }
    public static int[] solution(int[] numbers) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        int[] array = numbers;
        int sum = 0;
        for(int i = 0; i < array.length-1; i++) {
            for(int j = i+1; j < array.length; j++) {
            list.add(array[i]+array[j]);
            // if(!list.contains(array[i]+array[j])) {
            //     list.add(array[i]+array[j]);
            System.out.println(list);
            }
        }
        Set<Integer> set = new HashSet<Integer>(list);
        List<Integer> ans = new ArrayList<Integer>(set);
    
        int[] answer = new int[ans.size()];
        for(int a = 0; a<ans.size(); a++) {
            answer [a] = ans.get(a);
        }
        //만약 Treeset을 쓴다면?
        System.out.println();
        return answer;
    }
}