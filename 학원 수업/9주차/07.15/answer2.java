import javax.naming.Name;
import java.util.ArrayList;
import java.util.Scanner;

public class answer2 {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> array = new ArrayList<>();
        int i;

        String input = "";
        for (i = 0; i < 5; i++) {
            input = sc.nextLine();
            array.add(input);
        }
        for (i = 0; i < array.size(); i++) {
            if (i == 0 || i==1) {
                System.out.println(array.get(i) + "이 드라이~~");
            }

//        System.out.println(array[0]+ " 이 드라이버는 달릴 수 없습니다.");
//        System.out.println("0번쨰 "+array[0]);
//        System.out.println("1번쨰 "+array[1]);
//        if(array)
        }
    }
}