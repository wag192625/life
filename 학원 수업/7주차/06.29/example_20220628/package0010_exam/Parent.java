package package0010_exam;

import package0007_sandwich.pumkinsand;
import package0008_promotionExample.parent;

public class Parent {

    public String bagName;
    public int money;
// 생성자는 초기에 인스턴스 만드는걸 해줌
    public Parent(String input_bagName, int input_money) {
        // 자식 클래스에서 도용 가능
        this.bagName = input_bagName;
        // 
        this.money = input_money;
    }

    public void goToWork() {
        System.out.println("나는 출근합니다.");
    }

    public boolean buyBranch(int cost) {
        if(cost < this.money) {
            System.out.println("사 먹을 수 있습니다.");
            return true;
        } else {
            System.out.println("사 먹을 수 없습니다.");
            return false;
        }
    }
}

