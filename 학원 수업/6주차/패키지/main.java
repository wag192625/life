// import package2.*; // Overloading
import package3.*;
import java.util.Scanner;

public class main {

    public static void main(String[] arg){
        Scanner input = new Scanner(System.in);
        System.out.println("Name!");
        String inputStudentName = input.nextLine();
        
        System.out.println("Subject Name!");
        String inputSubjectName = input.nextLine();
        
        System.out.println("Grade Name!");
        int inputGradeName = input.nextInt();
        
        System.out.println("student = " + inputStudentName +"// subject = " + inputSubjectName + "// grade" + inputGradeName);

        //input 데이터 무결성 체크 (데이터가 잘 왔는지 확인)
        
        //인자값을 통해 인스턴스 생성자 생성
        StudentGrade student = new StudentGrade();
        // StudentGrade student_1 = new StudentGrade(inputStudentName);
        StudentGrade student_2 = new StudentGrade(inputStudentName,inputSubjectName,inputGradeName);

        System.out.println(student.ClassName);
        System.out.println("~~~~~~~~~~");
        System.out.println(student_2.ClassName);
        System.out.println(student_2.name);
        System.out.println(student_2.subject);
        System.out.println(student_2.grade);
        System.out.println("~~~~~~~~~~");


        // Overloading car1 = new Overloading();
        // System.out.println("car1.company : " + car1.company);
        // System.out.println();

        // Overloading car2 = new Overloading("model_name");
        // //컴퍼니는 이미 패키지에 지정되있어서 모델부터 시작
        // System.out.println("car2.company : " + car2.company);
        // System.out.println("car2.model : " + car2.model);
        // System.out.println();
        
        // Overloading car3 = new Overloading("model_name","black");
        // System.out.println("car3.company : " + car3.company);
        // System.out.println("car3.model : " + car3.model);
        // System.out.println("car3.color : " + car3.color);
        // System.out.println();

        // Overloading car4 = new Overloading("model_name","black",60);
        // System.out.println("car4.company : " + car4.company);
        // System.out.println("car4.model : " + car4.model);
        // System.out.println("car4.color : " + car4.color);
        // System.out.println("car4.maxSpeed : " + car4.maxSpeed);
        // System.out.println();
    }
}
