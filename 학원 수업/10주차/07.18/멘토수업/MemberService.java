package 멘토수업;

public class MemberService extends Member{
    boolean login(String id, String password){
        super.id = id;
        super.password = password;

        if(id.equals("hong")  && password.equals("12345")) {
            //boolean type 비교시 .equals
            return true;
        }else{
            return false;
        }
    }
    void logout(String id){
        super.id = id;
        System.out.println("로그아웃");
    }
    
}
