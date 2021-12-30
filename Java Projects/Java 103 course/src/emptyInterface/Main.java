package emptyInterface;

public class Main {
    private static void print(EmptyInterface object){ // Look here
        if(object instanceof ClassA) // Look here
            ((ClassA) object).printA(); // Look here
        else if(object instanceof ClassB)
            ((ClassB) object).printB(); // Look here
    }
    private static EmptyInterface getIt(int n){ // Look here
        if(n == 1)
            return new ClassA(); // Look here
        else
            return new ClassB(); // Look here
    }
    public static void main(String[] args){
        print(new ClassA()); // Look here
        print(new ClassB()); // Look here
        print(getIt(1)); // Look here
        print(getIt(2)); // Look here
    }
}