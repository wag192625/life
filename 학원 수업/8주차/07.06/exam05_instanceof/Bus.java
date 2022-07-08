// package exam05_instanceof;

public class Bus implements Vehicle, Payment {


	@Override
	public void run() {
		System.out.println(" 버스가 달린다.");
	}
//	강제성이 있고

	public void checkFare() {
		System.out.println(" 얼마 내었나요?");
	}

	@Override
	public void lostMoney() { System.out.println(money+"원을 결제했습니다.");}

}
