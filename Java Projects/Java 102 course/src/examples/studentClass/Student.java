package examples.studentClass;

public class Student {
    private static int studentCounter = 0;
    private int id; // Student id (auto set)
    private String name; // Student name
    private int age; // Student age
    private String department; // Student department in the university
    private float GPA; // Student GPA
    // default constructor
    public Student(){
        studentCounter++;
        this.id = studentCounter;
        this.name = "None";
        this.age = 0;
        this.department = "None";
        this.GPA = 0.0f;
    }

    /**
     * This is the detailed constructor
     * @param name student name
     * @param age student age
     * @param department  student department in the university
     * @param GPA student GPA
     */
    public Student(String name, int age, String department, float GPA){
        studentCounter++;
        this.id = studentCounter;
        this.name = name;
        this.age = age;
        this.department = department;
        try{
            setGPA(GPA);
        } catch (OverFlowNumber e){
            System.err.println(e.getMessage());
        }

    }

    /**
     * This is the Short Constructor
     * @param name student name
     */
    public Student(String name){
        studentCounter++;
        id = studentCounter;
        this.name = name;
        age = 0;
        department = "None";
        GPA = 0.0f;
    }
    // Setters and getters

    /**
     * Set ID of student
     * @param id student id
     */
    public void setId(int id){
        this.id = id;
    }

    /**
     * Get id of student
     * @return student id
     */
    public int getId(){
        return id;
    }

    /**
     * Set student name
     * @param name student name
     */
    public void setName(String name){
        this.name = name;
    }

    /**
     * Get student name
     * @return student name
     */
    public String getName(){
        return name;
    }

    /**
     * Set age of student
     * @param age student age
     */
    public void setAge(int age){
        this.age = age;
    }

    /**
     * Get student age
     * @return student age
     */
    public int getAge(){
        return age;
    }

    /**
     * Set department of student
     * @param department student department in the university
     */
    public void setDepartment(String department){
        this.department = department;
    }

    /**
     * Get department in the university of student
     * @return student department in the university
     */
    public String getDepartment(){
        return department;
    }

    /**
     * Set GPA of student
     * @param GPA student GPA
     */
    public void setGPA(float GPA) throws OverFlowNumber {
        if(GPA > 4.0f)
            throw new OverFlowNumber(GPA);
        this.GPA = GPA;
    }

    /**
     * Get GPA of student
     * @return student GPA
     */
    public float getGPA(){
        return GPA;
    }

    /**
     * Print all information of student
     */
    public void printInfo(){
        System.out.println("-------------------- " + getName() + " information --------------------\n"
                            + "ID: " + getId() + "\t\tAge: " + getAge()
                            + "\nDepartment: " + getDepartment() + "\t\tGPA: " + getGPA());
    }
}