package sec05.exam01_field_polymorphism;

public class Car {
	public Tire frontLeftTire = new HankookTire();
	public Tire frontRightTire = new HankookTire();
	Tire backLeftTire = new HankookTire();
	Tire backRightTire = new HankookTire();

	public Tire[] tires = {
			new newHankook Tire(),
			new newHankook Tire(),
			new newHankook Tire(),
			new newHankook Tire()
	}
	void run() {
		frontLeftTire.roll();
		frontRightTire.roll();
		backLeftTire.roll();
		backRightTire.roll();

		for(Tire tire : tires) {
			tire.roll();
		}
	}
}
