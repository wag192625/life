package exam01_equals;

public class Member {
	//필드
	public String id;
	
	//생성자!! (클래스를 토대로 인스턴스를 처음 만들 떄 세팅하는것)
	//String이라는 매개변수 id를 받아서 필드값 id에 할당(전달, 대입)
	public Member(String id) {
		this.id = id;
	}
	
	//메서드: 이 인스턴스가 갖고 있는 기능!
	//메서드: Object에 있는 equals 메소드를 재정의
	//오버라이딩은 상속을 받아서 재정의를 하는건데, Member는 상속을 어디서?
	//모든 클래스는 Object라는 클래스에서 시작되며, 상속받습니다.
	//equals를 재정의 해서 새로운 비교구문을 스스로 만들기
	//@ : 어노테이션은 아래 메서드의 성질을 JVM에게 선언해주는 구문
	//boolean : 이 메서드가 실행되고 최종적으로 반환(리턴)되는 "타입" 이 boolean(True/false 둘 중 하나로 반환)
	//(Object obj) : 매개변수로써 어떤 인스턴스든 Object로 "형변환" 한다
	//어떤 클래스든 Object 객체를 모두 상속받기 때문에 최고 부모 클래스인 Object로 "자동 형변환"이 가능하다.
	//어디까지나 타입의 형변환이다.(인스턴스의 타입이 바뀌는게 아닙니다.)
	//Member obj4 = new Member("blue"); > Object obj4 = new Member("blue");
	@Override
	public boolean equals(Object obj) {
		//실제로 구현된 인스턴스의 타입은 Member이기 떄문에 if문에 true가 뜬다.
		if(obj instanceof Member) {
			//Member 타입으로 obj매개변수를 형변환
			//Member라는 변수명으로 obj(주소)가 연결 
			Member member = (Member) obj;
			//id = member의 필드값
			//id = String이기 때문에 참조타입이므로 equals를 통해 비교
			//인스턴스의 id라는 필드값과 매개변수 onj(member)의 id를 비교
			if(id.equals(member.id)) {
				return true;
			}
		}
		return false;
	}
}
