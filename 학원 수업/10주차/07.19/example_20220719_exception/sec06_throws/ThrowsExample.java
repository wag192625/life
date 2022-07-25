package sec06_throws;

public class ThrowsExample {
	public static void main(String[] args) {
		try {
			findClass();	//>>ClassNotFoundException 에러발생!
			System.out.println("성공했습니다!");

//			case 1. 용사이름 출력;
//			case 2. 용사공격 출력;
//			case 3. 용사방어 출력;
//			case 4. 인벤토리 추가;
//
//			default case
//				throw new exception();
		} catch(ClassNotFoundException e) {
			System.out.println("클래스가 존재하지 않습니다");
		}
	}
	private  static void exceotion(){
		System.out.println("얘기치 못한 뭐시기 발생");
	}
	public static void findClass() throws ClassNotFoundException {
//		메서드를 실행하면 스로우의 에러부분으로 들어가고 위의 캐치 부분으로 들어간다.

		Class clazz = Class.forName("java.lang.String2");
	}
}

