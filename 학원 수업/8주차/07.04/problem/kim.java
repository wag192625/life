package problem;

import java.util.concurrent.TimeUnit;

public class kim implements time {
    int[] kim = { 11, 20, 44, 13 };

    public void loding() {
        try {
            for (int i = 0; i <= 200; i++) {
                System.out.println("Sleep " + i);
                if (i % 5 == 0) {
                    System.out.println("3초 김" + kim);
                }     
                TimeUnit.SECONDS.sleep(1);
            }     
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
