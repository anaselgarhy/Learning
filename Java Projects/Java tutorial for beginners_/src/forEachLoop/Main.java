package forEachLoop;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        String[] names = {"John", "Jane", "Jack", "Jill"};

        // for each loop and array
        for (String name : names) {
            System.out.println("Hello, " + name);
        }

        // for loop and collection
        ArrayList<String> names2 = new ArrayList<>();
        names2.add("John");
        names2.add("Jane");
        names2.add("Jack");
        names2.add("Jill");

        for (String name : names2) {
            System.out.println("Hello, " + name);
        }
    }
}
