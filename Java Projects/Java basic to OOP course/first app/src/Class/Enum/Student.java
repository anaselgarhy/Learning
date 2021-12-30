package Class.Enum;

public class Student {
    private String name;
    private int age;
    private Gender type; // Look here
    public Student(String name, int age, Gender type){
        this.name = name;
        this.age = age;
        this.type = type;
    }
    @Override
    public String toString(){
        return ("Student name: " + name + '\n' + "Student age: " + age + '\n' + "Student gender: " + type.name());
    }
}
