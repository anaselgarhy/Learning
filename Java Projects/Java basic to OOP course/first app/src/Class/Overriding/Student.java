package Class.Overriding;
public class Student extends University {
    private String name;
    private int id;
    public Student(String name, int id, String universityName, int universityId) {
        super(universityName, universityId); // Look here
        this.name = name;
        this.id = id;
    }
    @Override // Look here
    public String getName() {
        return name;
    }
    @Override
    public void setName(String name) {
        this.name = name;
    }
    @Override
    public int getId() {
        return id;
    }
    @Override
    public void setId(int id) {
        this.id = id;
    }
    public String getUniversityName(){
        return super.getName(); // Look here
    }
    @Override
    public String toString() {
        return "Student name: " + getName() + '\t' + "Student id: " + getId() + '\n'
                + "University name: " + getUniversityName() + '\t' + "University id: " + super.getId();
    }
}
