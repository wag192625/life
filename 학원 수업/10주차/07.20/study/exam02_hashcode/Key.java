// package sec03.exam02_hashcode;

public class Key {	//Key라는 클래스 (껍데기,설계도) (heap 메모리에 있는거 아님)
	public int number;
	
	public Key(int number) {
		//제일 가까운 객체인 Key라는 class를 가르킴
		//this.number >> Key라는 ㄱ클래스의 number라는 필드값을 가르킴
		//= number >> 매개변수 number가 this.number에 할당됨
		this.number = number;	
	}
	
	// (JVM아 Key 클래스에 있는 equals라는 메서드가 Object에서 상속받은 메서드가 아닌)//
	//재정의된 메서드인 것으로 인식할 수 있도록 @어노테이션 Override라고 선언

	//Object로 "자동형변환" (Object obj) >> 하면 모든 클래스의 부모는 Object이기 떄문에 가능
	//모든 클래스를 매개변수로 받을 수 있으므로 자바(객체)의 다형성을 표현한다.
	//(heap 메모리에 있는 인스턴스가 바뀌는것은 아님)
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Key) {
			Key compareKey = (Key) obj;
			if(this.number == compareKey.number) {
				return true;
			}
		} 
		return false;
	}
	//주소 + 31(홀수 > 특정연산작업속도를 간략히) + 기타등등(컴퓨터의 기초 메타데이터)
	//hashcode() 메서드는 equals() 메서드랑 동일하게 Object 클래스(최상위 부모클래스)의 메서드
	//어떤 클래스나 Object클래스르 상속받기 때문에 hashcode()와 equals() 메서드를 쓸 수 있다.
	@Override
	public int hashCode() {
		//String 묹자열은 상수풀이기 때문에 같은 주소를 가르킬 것이고
		//같은 주소이면 hashcode가 동일한게 return 받습니다.
		return number;
	}
}