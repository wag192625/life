package interface_example;

public interface RemoteControl {

	// 상수
	int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;
	// int BETTER_COUNT = 0;
	
	// 추상 메서드(껍데기만 있음)
	void turnOn();
	void turnOff();
	void setVolume(int volume);

	//default 메서드 (static X 인스턴스 없이 실행X, 자식 클래스 구현해야함)
	default void setMute(boolean mute) {
		// System.out.println("output");
		if(mute) {
			System.out.println("무음");
		} else {
			System.out.println("무음x");
		}
	}
	
	//정적 메서드 (인스턴스 없이 실행 O (static의 유무차이))
	static void changeBattery() {
		System.out.println("베터리 교체");
	}
}