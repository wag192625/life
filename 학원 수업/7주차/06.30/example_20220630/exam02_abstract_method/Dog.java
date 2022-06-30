package example_20220630.exam02_abstract_method;

public class Dog extends Animal {
	public Dog() {
		this.kind = "포유류";
		// public	String check;

		// super.check ="부모클래스"
		// this.check ="자식클래스"
	}

	@Override
	public void sound() {
		System.out.println("멍멍");
		// System.out.println(super.check + super.check.hashCode());
		// System.out.println(this.check + this.check.hashCode());
		// System.out.println(this.check == super.check);
	}
}