import java.util.*;

public class Solution {
    public static void main(String[] arg){
        solution;
    }
    // public int[] solution(int []arr) {
    // int[] answer = {};
    // // int[] arr = {1,1,3,3,0,1,1};
    // Stack<Integer> stack = new Stack<Integer>();
    // for(int i: arr){
    // stack.push(i);
    // if(arr[i] == i){
    // int top = stack.pop();
    // }
    // }
    // return answer;
    // }
    // }

    // import java.util.*;

    // class Solution {
    // boolean solution(String s) {
    // char [] char_arr = s.toCharArray();
    // Stack<Character> stack = new Stack<Character>();
    // for (char c : char_arr){
    // if (c == '('){
    // stack.push(c);
    // }else{
    // if (stack.empty()){
    // return false;
    // char top = stack.pop();
    // }
    // if (top != '('){
    // return false;
    // }

    class Solution {
        public int solution(String s) {
            int answer = 0;
            int[] num = {0,1,2,3,4,5,6,7,8,9};
            String[] str = {'zero','one','two','three','four','five','six','seven','eight','nine'};
            
            for(String i : s){
            System.out.println(s.replaceAll(str[0],num[0]));
            }
            
        return answer;
        }
    }
}