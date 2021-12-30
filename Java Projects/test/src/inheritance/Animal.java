package inheritance;

public class Animal {
    public static String name;
    private short age;
    private String id;
    private String eatType;

    Animal(String name, short age, String id){
        this.name = name;
        this.age = age;
        this.id = id;
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
