class Collatz {
    public static void main(String[] arg){
        asd();
    }

    public static long asd(){
        long answer = 0;
        long num = 626331;
        long i =0;

        for(i = 0; i<=500; i++){
            if(num%2==0){
                num = num/2;
            }else if(num==1){
                if(i<=500){
                break;
                }
                System.out.println(i+"1입니다.");
                break;
            }else if(num%2!=0){
                num = num*3+1;
            }
        }
        if(i>=500){
            i = -1;
        }
        answer= i;
        System.out.println(answer);
        return answer;
        
    //     for(i = 0; i<=500; i++){
    //         int sum = 0;
    //         if(num%2==0){
    //             num = num/2;
    //         }else if(num==1){
    //             System.out.println("1입니다.");
    //             break;
    //         }else if(num%2!=0){
    //             num = num*3+1;
    //         }else if(i==500){
    //             i = -1;
    //             break;
    //         }
    //     }
    //     if(i<=500){
    //         i = -1;
    //     }
    //     answer= i;
    //     return answer;
    // }
    }
}