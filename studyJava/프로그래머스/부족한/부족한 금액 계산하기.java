class Soultion{

    public static void main(String[] arg) { //붕어빵 틀
        int price = 3;  
        int money = 20;
        int count = 4;  // 속 재료
        System.out.println(solution(price, money, count));
    }

    public static long solution(int price, int money, int count) {
    long answer = -1;
    long sum= 0;

        for(int i=1; i<count+1; i++) {
            sum += price * i ;
        }
        
        if(sum > money){
            answer = sum -money;
        }

    return answer;
    }
}