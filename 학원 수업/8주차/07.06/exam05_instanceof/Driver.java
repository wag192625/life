// package exam05_instanceof;

public class Driver implements Payment {
//	public void drive(Vehicle vehicle){
//		vehicle run();
//	}
//	public void drive(Bus bus){
//		bus.run();
//	}
	public void drive(Vehicle vehicle) {
		if(vehicle instanceof Bus) {	//인스턴스 오브가 작동되는 이유 = 버스는 바이클에 상속이 되어있어서
			Bus bus = (Bus) vehicle;
			//형변환
			System.out.println("요금은 "+ money +"입니다.");
			bus.lostMoney();
			//요금은 얼마입니까

		}
		if(vehicle instanceof Taxi) {
			Taxi taxi = (Taxi) vehicle;
			//형변환
			System.out.println("톨게이트 요금은 "+ money +"입니다.");
			taxi.pass();
			//톨게이트비?

		}
		vehicle.run();

	}

	@Override
	public void lostMoney() {

	}
}
