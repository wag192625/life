package example_20220630.exam01_abstract_class;

public class SmartPhone extends Phone {
	//생성자
	public SmartPhone(String owner) {
		super(owner);
	}	//부모클래스의 생성자 사용
	//메소드
	public void internetSearch() {
		System.out.println("인터넷 검색을 합니다.");
	}
}
