package sec05.exam01_anonymous_extends;

public class Anonymous extends Person {
	//??? ??????? ????
	Person field = new Person() {
		int fieldInt;
		void work() {
			System.out.println("????????");
		}
		@Override
		void wake() {
			fieldInt = 40;
			System.out.println("_first_ 6??? ??????.");
			work();
		}
	};
	
	void method1() {
		//????????????? ????
		Person localVar = new Person() {
			void walk() {
				System.out.println("???????.");
			}
			@Override
			void wake() {
				System.out.println("7??? ??????.");
				walk();
			}
		};
		//??????? ???
		localVar.wake();
	}
	
	void method2(Person person) {
		person.wake();
	}
}











