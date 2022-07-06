package exam01_field_polymorphism;

public class Car {
	public Tire frontLeftTire = new HankookTire();
	public Tire frontRightTire = new HankookTire();

	public KumhoTire[] tires;

	Tire backLeftTire = new HankookTire();	//접근제한자 public 없음
	Tire backRightTire = new HankookTire();

	Number01_break num1 = new Number01_break();

	Break break01 = new Number01_break();

	Pedal pedal01 = new Number01_break();


//	public Tire[] tires = {
//			new newHankook Tire(),
//			new newHankook Tire(),
//			new newHankook Tire(),
//			new newHankook Tire()
//	}
	void run() {
		num1.push();
		num1.stop();

		System.out.println("----------------run01-----------------");

		break01.stop();

		System.out.println("----------------run02-----------------");

		Number01_break break02 = (Number01_break)break01;
		break02.push();
//		부모클래스로 선언하면 자식클래스 메소드를 사용하지 못하지만
//		자식클래스로 선언하면 부모클래스와 자식클래스 메소드 모두 사용 가능

		System.out.println("--------check0002--------");

		break02.defaultmethod_install_pedal(frontRightTire);
		frontRightTire = new KumhoTire();
		break02.defaultmethod_install_pedal(frontRightTire);
		frontRightTire = new newHankookTire();
		break02.defaultmethod_install_pedal(frontRightTire);



		frontLeftTire.roll();
		frontRightTire.roll();
		backLeftTire.roll();
		backRightTire.roll();

		for(Tire tire : tires) {
			tire.roll();
		}
	}
}
