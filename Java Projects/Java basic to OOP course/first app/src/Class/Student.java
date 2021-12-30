package Class;
public class Student extends University {
    // Properties or Attributes
    private String name;
    private short age;
    // Behaviors
    public Student(String name, int age, String unName){
        this.name = name;
        this.age = (short) age;
        this.unName = unName;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setAge(short age){
        this.age = age;
    }
    public short getAge(){
        return age;
    }
}
