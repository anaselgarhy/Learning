package Class.Aggregation;

public class Department {
    public String name;
    public int id;
    // Aggregation Student
    Student student = new Student();
    public String fullInfo(){
        return ("Department name: " + name + "\t\t" + "Department id: " + id + '\n'
        + "Student name: " + student.getFullName() + "\t\t" + "Student id: " + student.getId());
    }
    @Override
    public String toString(){
        return (name + ' ' + id);
    }
}
