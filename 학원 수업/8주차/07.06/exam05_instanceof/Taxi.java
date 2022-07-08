// package exam05_instanceof;

public class Taxi implements Vehicle,Hipass {
	// 필드 생성
	
	//생성자 생성
		

	@Override
	public void run() {
		System.out.println("택시가 달린다.");
	}

	public void lostMoney(){
		System.out.print(money);
	}

	public void pass(){	
		System.out.println(money+"원이 자동 결제 되었습니다.");
	}
//
}
