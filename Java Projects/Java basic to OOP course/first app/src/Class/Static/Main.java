package Class.Static;

public class Main {
    public static void main(String[] args){
        Student.gender = "Mail"; // Look here
        Student student1 = new Student();
        student1.name = "Anas";
        System.out.println(student1.name + ' ' + student1.gender);
        Student student2 = new Student();
        student2.name = "Omar";
        System.out.println(student2.name + ' ' + student2.gender);
    }
}
