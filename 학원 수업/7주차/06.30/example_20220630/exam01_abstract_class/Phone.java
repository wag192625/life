package example_20220630.exam01_abstract_class;

public abstract class Phone {
	//필드
	public String owner;
	
	//생성자
	public Phone(String owner) {
		this.owner = owner;
	}	// 오버로딩
	
	//메서드
	public void turnOn() {
		System.out.println("폰 전원을 켭니다.");
	}	//값이 있으면 추상 클래스, 없으면 인터페이스
	public void turnOff() {
		System.out.println("폰 전원을 끕니다.");
	}
}
