import java.util.ArrayList;

class hello3 {
    public static void main(String[] arg) {
        System.out.println("programers start!");
        String[] inputText = {"Jane", "Kim"};
        ArrayList<String> inputArray = new ArrayList<String>();
        inputArray.add("jane");
        inputArray.add("Kim");
        System.out.println(solution(inputArray));
    }

    public static String solution(ArrayList<String> seoul) {
        System.out.println(seoul.size());
        String answer = "";
        for(int i = 0; i < seoul.size(); i++) {
            if(seoul.get(i) == "Kim") {
                System.out.println("ok");
                
            }

        }

        return answer;
    } //메소드 생성됨
}
