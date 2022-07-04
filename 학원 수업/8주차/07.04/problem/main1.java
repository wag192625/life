package problem;

import java.util.concurrent.TimeUnit;

public class main1 {
    public static void main(String[] arg) {
        try {
            for (int i = 0; i <= 2; i++) {
                TimeUnit.SECONDS.sleep(1);
                System.out.println("Sleep " + i);

                
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    // public static void run() {
    //     time time = new time();
    //     System.out.println("111");
    // }
}