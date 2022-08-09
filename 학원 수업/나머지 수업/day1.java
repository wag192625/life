// 77
// 82 소수점 계산할 때는 먼저 정수로 바꾸고 (*10) 계산
// 117 스위치 문에서 디펄트 없어도 됨
// 122
public class day1 {
    public static void main(String[] args) {
        int sum = 0;
        int i;
        int x;
        int y; 
        for( i=3; i<100; i++){
            if(i % 3 == 0){
                sum += i;
            }
        }
        System.out.println("합:"+sum);
        for(x=0; x<=10; x++){
            for(y=0; y<=10; y++){
                if((4*x+5*y)==60){
                    System.out.println("("+x+","+y+")");
                    }
                }
            }
        for(x=0; x<4; x++){
            for(y=0; y<x+1; y++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}