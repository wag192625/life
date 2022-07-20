package question;

public class Student {
    //필드
    //private : 접근 제한자 =같은 클래스 내에서만 접근 가능
    //student.name = "정명훈"; 안됨!!
    //public : 모두 다 접근 가능
    //default : 같은 패키지 내에서 접근 가능
    //protect : 같은 패키지 + 상속 내에서 접근 가능
    private String name;
    private int  jo;
    //생성자 : 클래스 이름과 동일
    //오버로딩(클래스의 스타일) : 생성자의 매개변수를 통해 다양한 타입으로 생성
    //기본적으로 생성자(매개변수 없는) 1개는 있다. (안보일 뿐)
    public Student(String i_name, int i_jo) {
        //this = 제일 가까운 객체를 지칭 > Student 라는 클래스
        //this.name = Student의 필드 name
        this.name = i_name;
        this.jo = i_jo;
    }
    //메서드
    //getter, setter 쓰는 이유
    //= 객체의 캡슐화, 데이터 입출력이라는 기능의 메서드를 잘 쓰기 위해서
    //외부에서 필드값을 바로 조회 또는 수정을 막기 위해서! 객체는 딱 닫혀야 합니다!
    public String getName() {
        return name;
    }

    public int getJo() {
        return jo;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setJo(int jo) {
        this.jo = jo;
    }
    //Student 인스턴스 타입으로 아래 equals 라는 메서드의 매개변수로 들어감
    // (단, Object "타입" 형변환)
    @Override
    public boolean equals(Object obj){
        //instanceof : 메모리 heap에 있는 인스턴스끼리 비교하는 것
        // 상속받았다면 부모클래스도 동일하다가 true가 나옵니다.
        //인스턴스가 같은 핏줄이면 true ( 모든 인스턴스는 Object의 자손이기 때문에)
        // 예외처리(Exception)이랑 비슷함
        if(obj instanceof Student) {
            Student student_1 = (Student) obj;
            //id = member의 필드값
            //id = String이기 때문에 참조타입이므로 equals를 통해 비교
            //인스턴스의 id라는 필드값과 매개변수 onj(member)의 id를 비교
            if(jo ==student_1.getJo() && name == student_1.getName()){
                //필드명,메소드 = 학생_1의 Jo를 확인
            }
        }
        return false;
    }
}
