package exam01_field_polymorphism;

public class CarExample {
	public static void main(String[] args) {
		Car myCar = new Car();
		
		myCar.run();

		System.out.println("--------check0001--------");

		myCar.frontLeftTire = new KumhoTire();
		myCar.frontRightTire = new KumhoTire();

		myCar.run();

		System.out.println("--------check0001--------");
		myCar.tires[0] = new KumhoTire();
		myCar.tires[1] = new KumhoTire();

		myCar.run();
	}
}
