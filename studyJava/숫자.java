public class 숫자 {
    public static void main(String[] arg) {
        Number number1 = new Number();  //첫번째 number
        Number number2 = new Number();  //첫번째 number
        // 설계도 이름 /// 실제 구현

        // int intTest = 30;
        // String[] stringArraytest = {"abc","efg"};
        number1.numStatic++;    // 클래스 필드
        number1.numNormal++;    // 인스턴스 필드

        System.out.println("static 1 = "+ number1.numStatic);
        System.out.println("instance 1 = "+ number1.numNormal);
        System.out.println("static 2 = "+ number2.numStatic);    //static 이라 num 1과 num2 공유
        System.out.println("instance 2 = "+ number2.numNormal);

        // System.out.println(intTest);
        // System.out.println(stringArraytest);
    }
}
class Number{
    static int numStatic = 10;  //스태틱 필드
    int numNormal = 10;         //인스턴스 필드
}
//메모리 내에서 같은 변수( 하나밖에 안들어가서)