package Class.Aggregation;
public class Student {
    public String firstName, lastName;
    private int id;
    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }
    public String getFullName(){
        return firstName + ' ' + lastName;
    }
}
