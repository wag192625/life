package interface_example;

public interface Searchable {
	// 10,20,25,120
	default public void search(String url) {
		int ch = Integer.parseInt(url);
			if(ch<15){
				ch = 10;
			}else if(ch<22){
				ch = 20;
			}else if(ch<52){
				ch = 25;
			}else {
				ch = 120;
			}
			url = Integer.toString(ch);
		System.out.println(url+" 채널로 이동했습니다.");
	}
}
