package problem;

import java.util.concurrent.TimeUnit;

public class time implements Kim,Lee,Park{
    int[] lee= {};
    int[] kim= {};
    int[] park= {};
    int[] arr = {};
    int i = 0;
    int t = 0;

   public void loding(int j,int[] arr){
        try {
            for (int i = 0; i <= 200; i++) {
                if (t % 3 == 0) {
                    System.out.println("kim" + arr[i]);
                } else if (t % 5 == 0) {
                    System.out.println("park" + arr[i]);
                } else if (t % 11 == 0) {
                    System.out.println("lee" + arr[i]);
                }else {
                    System.out.println("Sleep " + i);
                }
                t++;
                TimeUnit.SECONDS.sleep(1);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

}