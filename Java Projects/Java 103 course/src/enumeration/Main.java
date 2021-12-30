package enumeration;

public class Main {
    public static void main(String[] args){
        try{
            Gender g = Gender.valueOf("FEMALE");
            System.out.println(g.name());
        } catch(IllegalArgumentException e){
            System.out.println("There in not constant like that!");
        }
    }
}
