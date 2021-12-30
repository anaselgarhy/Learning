package firstPackage;

import java.util.ArrayList;

public class ArrayLists {
    public static void  main(String[] args){
        ArrayList<String> names = new ArrayList<String>();
        // Add
        names.add("Anas"); // index 0
        names.add("Omar"); // index 1
        names.add("Abdullah"); // index 2
        // Print all array list objects
        System.out.println(names);
        // get one object from array list
        System.out.println(names.get(1));
        // get size of array list
        System.out.println("Array list size " + names.size());
        // remove object
        names.remove(2); // or names.remove("Abdullah");
        System.out.println(names.contains("Anas")); // Search on array list
    }
}
