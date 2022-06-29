package package0010_exam;

public class Child extends Parent{

    public Child(String input_bagName, int input_money){
        super(input_bagName, input_money);
        // 샌드위치 보면서 슈퍼 인지하기
    }

    @Override
    //오버라이드는 부모의 메소드를 가져와 새롭게 지정할 수 있음.
    //하는 이유 : 
    public void goToWork() {
        System.out.println("나는 학교에 갑니다.");
        
    }
    public void goToPCRoom() {
        System.out.println("나는 PC방에 갑니다.");
    }

}
