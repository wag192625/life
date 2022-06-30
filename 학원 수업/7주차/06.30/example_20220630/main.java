package example_20220630;
import example_20220630.exam01_abstract_class.*;
import example_20220630.exam02_abstract_method.*;

public class main{

    public static void main(String[] arg) {


        // abstract01();
        abstract02();
    }

    private static void abstract01() {
        SmartPhone smartPhone = new SmartPhone("홍길동");

        smartPhone.turnOn();
        smartPhone.internetSearch();
        smartPhone.turnOff();

        System.out.println("----형변환전----");
        
        Phone Not_smartPhone = (Phone) smartPhone;
        Not_smartPhone.turnOn();
        // Not_smartPhone.internet.Search();
        Not_smartPhone.turnOff();
        System.out.println("----형변환후----");
    }

    private static void abstract02() {
        
        //선언하는 곳에 가서 타입을 찾고 메모리를 불러온다.

        Dog dog = new Dog();
        //Dog 타입에
        Cat cat = new Cat();

        // System.out.println();

        dog.sound();
        //추상 클래스에 상속을 받은 도그 라는 인스턴스의 사운드 출력
        cat.sound();
        System.out.println("-----");
        
        // 변수의 자동 타입 변환
        Animal animal = null;
        // stack (선언) = heap(할당);
        // animal 이란 변수르 호출시 주소값 heap에 있음
        // 주소값은 stack이랑 heap이랑 공유
        // 지금의 주소값 : null(공백이라는 뜻);
        animal = new Dog();
        // = Dog라는 클래스를 new가 참조해서 인스턴스화 시킨다.
        // 주소값이 바뀌어서 animal을 호출 시 new Dog를 불러옴
        animal.sound();
        // 변수를 찾고 주소를 찾고 할당을 찾는다.
        // animal과 Dog는 서로 상속관계
        animal = new Cat();
        animal.sound();
        System.out.println("-----");
        
        // 매개변수의 자동 타입 변환
        animalSound(new Dog());
        // 
        animalSound(new Cat());
        
    }

    // 메인 메소드 밖에 있어서 참조가 가능
    public static void animalSound(Animal animal) {
                                // (new Cat()) 인자값을 받음
        animal.sound();
        //
    }
}
//  // 변수의 자동 타입 변환
//  Animal animal = null;
//  // 선언 후 할당까지 해줌, Animal은 추상 클래스
//  animal = new Dog();
//  // 자동 타입 변환(부모타입의 메소드를 갖다 쓰기 위해 형변환)
//  animal.sound();
//  animal = new Cat();
//  //부모 타입으로 형변환 후(속인 후) 검색 후
//  animal.sound();
//  System.out.println("-----");