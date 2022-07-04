package interface_example;

public interface RemoteControl {

	// 상수
	int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;
	// int BETTER_COUNT = 0;
	
	// 추상 메서드(껍데기만 있음, 오버라이딩 가능)
	void turnOn();
	void turnOff();
	void setVolume(int volume);

	//default 메서드 (static X 인스턴스 없이 실행X, 자식 클래스 구현해야함, 오버라이딩 가능)
	// 구현은 되있지만 실행은 안되기 때문에 오버라이딩 해야함
	default void setMute(boolean mute) {
		// System.out.println("output");
		if(mute) {
			System.out.println("무음");
		} else {
			System.out.println("무음x");
		}
	}
	
	//정적 메서드 (인스턴스 없이 실행 O (static의 유무차이), 상속 안됨)
	static void changeBattery() {
		System.out.println("베터리 교체");
	}
}