package package0004;

public class CheckYn {
    public static boolean CheckYn(String check, String type) {

        if(type == "inputCheck") {
            if(check == "yes") {
                System.out.println("데이터에 저장합니다");
                return true;
            }else if (check == "no") {
                System.out.println("입력값을 삭제합니다");
                return false;
            }else {
                System.out.println("입력을 올바르게 해주세요");
                return false;
            }

        }else if(type == "brakeCheck") {
            if(check == "yes") {
                System.out.println("데이터의 입력을 계속합니다");
                return true;
            }else {
                System.out.println("데이터의 입력을 종료합니다");
                return false;
            }
        }else {
            return false;
        }
    }
    
}
