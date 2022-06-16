class Solution {
    public int solution(int[] nums) {
        int[] numbers = {1,2,3,4,5,6,7,8};
        int answer = 0;
        // int[] array = numbers;
        int sum = 0;
        // ArrayList<Integer> num = new ArrayList<Integer>();
        for(int i = 0; i<numbers.length-2; i++) {
            for(int j = i+1; j<numbers.length-1; j++) {
                for(int k = j+1; k<numbers.length; k++){
                    sum = (numbers[i] + numbers[j] + numbers[k]);
                    System.out.println(sum);
                    }
                }
            }
        // 소수 = 1과 자기 자신으로만 나눌 수 있는 수
        // 만약 자기 자신으로만 떨어진다면 
        // if(sum % == 0){
        // }
        return answer;           
    }
}