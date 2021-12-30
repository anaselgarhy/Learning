package Class.Interface;

public class Person implements info{
    private String name;
    public Person(String name){
        this.name = name;
    }
    @Override
    public void print(){
        System.out.println(name + " - " + age);
    }
}
