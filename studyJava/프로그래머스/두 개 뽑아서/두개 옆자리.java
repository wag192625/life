import java.util.ArrayList;

class Solution {
    public static int[] solution(int[] numbers) {
    ArrayList<Integer> arr = new ArrayList<Integer>();
    
    int[] array = numbers;
    for (int i=0; i < array.length-1; i++) {
        for(int j=i+1; j < array.length; j++) {
            arr.add(numbers[i] + numbers[j]);
            if(!arr.contains(numbers[i] + numbers[j])){
                arr.add(numbers[i] + numbers[j]);
                }
            }
        }
    int[] answer = new int[arr.size()];
    for (int a=0; a<arr.size(); a++) {
        answer[a] = arr.get(a);
    }
    Arrays.sort(answer);
    // System.out.println(answer);
    return answer; }
}