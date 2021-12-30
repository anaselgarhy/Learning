package Class.Aggregation;

public class Main {
    public static void main(String[] args){
        Department department = new Department();
        department.name = "IT";
        department.id = 7665;
        department.student.firstName = "Anas";
        department.student.lastName = "Elgarhy";
        department.student.setId(8654);
        System.out.print(department.fullInfo());

    }
}
