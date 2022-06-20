import java.util.*;

public class main{
    public static void main(String[] arg){
    Scanner input = new Scanner(System.in);
    System.out.println("OS타입을 입력하세요.");
    System.out.println("1. MAC OS 일 경우 1을 입력하세요.");
    System.out.println("2. Window OS일 경우 2를 입력하세요.");

    int osType = input.nextInt();
    OsCheck.osCheck(osType);

    boolean checkComputerwhile = true;
    ArrayList<String> computerArray = new ArrayList<String>();
    
    boolean branch = false;
    String checkOk = "";
    String computerInputData = "";

    while(checkComputerwhile) {
        System.out.println("컴퓨터 사양을 입력해주세요.");
        System.out.println("ex) cpu:i7, ram:8g, ssd:128g.");

        computerInputData = input.nextLine();
        System.out.println("입력하신 내용이 다음과 같습니까? 맞으면 yes, 아니면 no를 입력해주세요.");

        System.out.println(computerInputData);
        checkOk = input.nextLine();
        branch = CheckYn.checkYn(checkOk, "inputCheck");

        

    }

    
    }
}