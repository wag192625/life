package problem;

import java.util.concurrent.TimeUnit;

public class Lee implements time {
    int[] lee = { 39, 12, 63, 44 };
    public void loding() {
        try {
            for (int i = 0; i <= 200; i++) {
                System.out.println("Sleep " + i);
                if (i % 11 == 0) {
                    System.out.println("11초 이" + lee);
                }
                TimeUnit.SECONDS.sleep(1);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
