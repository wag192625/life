package sec05.exam01_anonymous_extends;

public class AnonymousExample {
	public static void main(String[] args) {
		Anonymous anony = new Anonymous();
		//�͸� ��ü �ʵ� ���
		anony.field.wake();
		//�͸� ��ü ���ú��� ���
		System.out.println("----anony.method1();----");
		anony.method1();
		//�͸� ��ü �Ű��� ���
		System.out.println("----anony.method1();----");
		anony.method2(
			new Person() {
				void study() {
					System.out.println("�����մϴ�.");
				}
				@Override
				void wake() {
					System.out.println("8�ÿ� �Ͼ�ϴ�.");
					study();
				}
			}
		);
	}
}
