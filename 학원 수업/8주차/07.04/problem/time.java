package problem;

import java.util.concurrent.TimeUnit;

public interface time {
    int[] lee= {};
    int[] kim= {};
    int[] park= {};

    // kim kim = new kim();
    // lee lee = new lee();
    // park park = new park();
    default public void loding() {
        try {
            for (int i = 0; i <= 200; i++) {
                System.out.println("Sleep " + i);
                if(i%3==0) {
                    System.out.println("3초 박" + park);
                } else if(i%5==0) {
                    System.out.println("3초 김" + kim);
                } else if(i%11==0) {
                    System.out.println("3초 이" + lee);
                }
                TimeUnit.SECONDS.sleep(1);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}