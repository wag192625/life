package interface_example;

public class Audio implements RemoteControl {
    // 필드
    private int volume;

    // turnOn() 추상 메소드의 실체 메서드
    public void turnOn() {
        System.out.println("오디오를 켭니다.");
    }
    
    // turnOff() 추상 메소드의 실체 메서드
    public void turnOff() {
        System.out.println("오디오를 끕니다.");
    }

    public void setVolume(int volume) {
        if(volume<RemoteControl.MAX_VOLUME) {
            this.volume = RemoteControl.MAX_VOLUME;
        } else if(volume<RemoteControl.MIN_VOLUME) {
            this.volume = RemoteControl.MIN_VOLUME;
        } else {
            this.volume = volume;
        }
        System.out.println("현재 볼륨"+this.volume);
    }

    public void setMute(boolean mute) {
		// System.out.println("output");
		if(mute) {
			System.out.println("무음");
		} else {
			System.out.println("무음x");
		}
	}
}
