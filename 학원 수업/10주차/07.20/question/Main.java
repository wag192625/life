package question;

public class Main {
    public static void main(String[] arg) {

        Student name1 = new Student("정명훈",1);
        Student name2 = new Student("정명훈",2);
        Student name3 = new Student("정지훈",3);

        if(name1.equals(name2)) {	// obj1와 obj2 객체를 비교 (단, 참조타입이여서 equals 메서드를 써서 비교)
            //기본 타입끼리 비교할 때에는 == 사용
            System.out.println("name1 name2같음.");
        } else {
            System.out.println("name1 name2같지 않음.");
        }

        if(name1.equals(name3)) {
            System.out.println("name1 name3같음.");
        } else {
            System.out.println("name1 name3같지 않음.");
        }
        name3=name2;
        if(name3.equals(name2)) {
            System.out.println("name2 name3같음.");
        } else {
            System.out.println("name2 name3같지 않음.");
        }
    }
}
