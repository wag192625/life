// package exam05_instanceof;


import Going.*;

public class DriverExample {
	public static void main(String[] args) {
//		Driver driver = new Driver();
//		// 드라이버 호출
//		Bus bus = new Bus();
//		// 버스 호출
//		System.out.printf("");
//		Taxi taxi = new Taxi();
//		// 택시호출
//
//
//		driver.drive(bus);
//		driver.drive(taxi);
		//형변환함

//		ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
		System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
		Master master = new Master();
		Pro pro = new Pro();
		Beginner beginner = new Beginner();
		Road road = new Road();
		System.out.println("이제부터 천안에서 고속도로를 이용하여 서울로 갑니다.");

		System.out.println("일반 도로로 달립니다. 제한속도 60km 입니다.");
		road.road(pro);

		System.out.println("고속 도로로 달립니다. 제한속도 100km 입니다.");
		road.road(master);

		System.out.println("일반 도로로 달립니다. 제한속도 60km 입니다.");
		road.road(beginner);

		System.out.println("서울에 도착하였습니다.");
	//고속도로 구현해야함

	}
}
        // 버스와 택시에 인터페이스를 추가 (인터페이스의 다양성을 추가해서 기능 강제성 구현)
        // 1. 요금 납부 인터페이스, 하이패스 인터페이스를 만드시고 구현하세요.	ok
        // 하이패스는 요금 납부를 상속 받습니다. 								ok
        // 버스는 하이패스를 쓰지 않습니다.									ok

        // 2.형변환 (객체 상속과 형변환을 통해 유연한 객체 활용)
		// >>>드라이버 형변환초보자
        // 2. (객체)형변환 하는 이유 : 뎁스를 만들기 위해. 드라이버는 초보자, 숙련자, 전문가로 나뉩니다.
        // 초보자는 속도를 30km 준수하고, 숙련자는 60km, 전문가는 100km로 달립니다.
        // 고속도로를 달릴 수 있는 것은 전문가에요. 고속도로를 달릴 때만 전문가 타입으로 변환해서
        // 고속도로를 달리세요. 톨게이트를 빠져나가면 초보자로 바꾸는 드라이버가 있습니다.
        // (기본)형변환을 통해 System.out.print로 천안에서 고속도로 타고 서울까지 가는 문구를
        // 출력하세요.

        // 추상 클래스와 인터페이스를 왜?! 쓰는지와 어떤 경우에 쓰는지 고민
