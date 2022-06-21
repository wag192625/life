package package3;

public class StudentGrade {
    public String ClassName = "4Class";
    public String name;
    public String subject;
    public int grade;
    public StudentGrade() {
    }
    public StudentGrade(String input_name) {
        this.name = input_name;    
    }
    public StudentGrade(String input_name, String input_subject, int input_grade) {
        this.name = input_name;
        this.subject = input_subject;
        this.grade = input_grade;
    }
}