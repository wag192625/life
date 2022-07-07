package problem;

import java.util.concurrent.TimeUnit;

public class Park implements time{
    int[] park = { 52, 36, 98, 7 };
    public void loding() {
        try {
            for (int i = 0; i <= 200; i++) {
                System.out.println("Sleep " + i);
                if(i%5==0) {
                    System.out.println("5초 박" + park);
                }
                TimeUnit.SECONDS.sleep(1);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
