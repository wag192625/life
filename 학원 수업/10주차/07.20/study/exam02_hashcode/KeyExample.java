// package sec03.exam02_hashcode;

import java.util.HashMap;

public class KeyExample {
	public static void main(String[] args) {
		//Key 객체를 식별키로 사용해서 String 값을 저장하는 HashMap 객체 생성
		//Hashmap 이라는 타입으로 선언하되 안에 값은 Key라는 객체와 String 문자열을 넣는다.
		// = new HashMap<Key,String> : Heap 메모리에 인스턴스 만들기
		// HashMap<String, String> Key 위치는 String, Value 위치는 String
		//Key(String)으로 검색해서 Value(String)을 받는다 (HashMap의 구조)
		//HashMap 특징 : Key값은 중복 안됨
		// Key값을 "김준석", Value "오전 수업"
		// Key값을 "김준석", Value "오후 수업"
		// "김준석" 을 검색하면 "오후 수업"이 뜸
		HashMap<Key, String> hashMap = new HashMap<Key, String>();
		//Key라는 객체타입으로 testKey라는 변수명으로 타입 선언
		//=new Key(23; heap 메모리에서 Key라는 인스턴스를 생성 (단, 인자값 23 넣음)
		//생성자 (매개변수 23인) 실행
		Key testkey = new Key(23);
		Key testkey_1 = new Key(23);

		// json 포맷으로 인터넷 통신을 주로 합니다. (key, value)
		//식별키 "new Key(1)" 로 "홍길동"을 저장함
		//hashMap 에는 put() : hashMap에 데이터 넣기
		//String[] a; a[0] = "김준석"
		//"김준석" = "홍길동"
		//key값이 중복이 안돼요~
		hashMap.put(new Key(1), "홍길동");
		hashMap.put(testkey, "정명훈");
		hashMap.put(testkey, "중명훈");
		
		//식별키 "new Key(1)" 로 "홍길동"을 읽어옴
		//hashMap.get() : 인자값(Key)을 넣어서 key와 함께 넣은 value를 반환(출력)
		//hashMap.get() 메서드의 비교 방식
		//*_*_*__*_*_*__**__*_*_*__*_*__*_*__**__*_*_*_ */
		//new Key(1)이라고 get()에 매개변수를 넣으면
		//새로운 인스턴스가 만들어져요!
		//★홍길동의 key값과 다르다고 인식(인스턴스가 다르고, 주소가 다르므로 hashcode()도 다르기 떄문)
		//★홍길동의 key와 다르다고 인식 (hashcode()기반으로 구분 = HashMap의 자료저장 구조)
		String value  = hashMap.get(new Key(1));
		System.out.println(value);
		//"중명훈"이라는 문자열의 부모 해시코드 메서드
		System.out.println(hashMap.get(testkey).hashCode());

		Object obj = new Object();
		Object obj_1 = new Object();
		System.out.println("------------------------------");
		System.out.println(obj);
		System.out.println(obj.hashCode());
		System.out.println(obj_1);
		System.out.println(obj_1.hashCode());
		//해시코드랑 주소는 다르다. 블로그 등에 같다고 나오면 코웃움치자
	}
}


