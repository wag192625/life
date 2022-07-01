package interface_example;

public class SmartTelevision implements RemoteControl, Searchable {
	private int volume;
	
	public void turnOn() {
		System.out.println(" ");
	}	
	public void turnOff() {
		System.out.println(" ");
	}
	public void setVolume(int volume) {
		if(volume>RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		} else if(volume<RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		} else {
			this.volume = volume;
		}
		System.out.println(" " + volume);
	}
	
	// 10,20,25,120
	// public void search(String url) {
	// 	int ch = Integer.parseInt(url);
	// 		if(ch<15){
	// 			ch = 10;
	// 		}else if(ch<22){
	// 			ch = 20;
	// 		}else if(ch<52){
	// 			ch = 25;
	// 		}else {
	// 			ch = 120;
	// 		}
	// 		url = Integer.toString(ch);
	// 	System.out.println(url+" 채널로 이동했습니다.");
	// }
}
