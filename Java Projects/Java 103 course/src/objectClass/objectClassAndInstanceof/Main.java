package objectClass.objectClassAndInstanceof;

public class Main {
    // Look here
    private void function(Object o){ // Look here
        if(o instanceof A) // Look here
            System.out.println("A Class");
        else if (o instanceof B) // Look here
            System.out.println("B Class");
    }
    public static void main(String[] args){
        new Main().function(new A()); // Look here
        new Main().function(new B()); // Look here
    }
}
