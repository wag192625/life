package problem;

public class main1 {
    public static void main(String[] arg) {
        run();
    }
    public static void run() {
        int[] kimCh = { 42, 152, 33, 74 };
        int[] leeCh = { 39, 12, 63, 44 };
        int[] parkCh = { 52, 36, 98, 7 };
        Kim kim = new Kim();
        Lee lee = new Lee();
        Park park = new Park();

        kim.loding(3,kimCh);
        lee.loding(11,leeCh);
        park.loding(5,parkCh);
//         System.out.println("111");
    }
}