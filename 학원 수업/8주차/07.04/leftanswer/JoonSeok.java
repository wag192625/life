package leftanswer;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

public abstract class JoonSeok {
    private static int time = 0;
    private static int i = 0;
    private static final int[] CHANNEL = {10, 20, 30, 40, 50};
//    private static ArrayList<Integer> Time = new ArrayList<>();
    
    public JoonSeok(String name, int sec) {
        
    }

    public static void changeCh(String name, int sec) {
        System.out.println("----------------");
        System.out.println(name +"이 채널을 바꿉니다.");
        System.out.println(name +"의 "+sec+"초가 흐릅니다.");
        System.out.println("----------------");
    }

    public static void ChangeChannel() throws InterruptedException {
        for(i=0; i<CHANNEL.length; i++) {
            if (time % 3 == 0) {
                JoonSeok.changeCh("박", 3);
                System.out.println("바뀐 채널: " + CHANNEL[i]);
            }
            if (time % 5 == 0) {
                JoonSeok.changeCh("김", 5);
                System.out.println("바뀐 채널: " + CHANNEL[i]);
            }
            if (time % 11 == 0) {
                JoonSeok.changeCh("이", 11);
                System.out.println("바뀐 채널: " + CHANNEL[i]);
            }
            TimeUnit.SECONDS.sleep(1);
            time++;
            if (i == 4) {
                i = 0;
            }
        }
    }
}
