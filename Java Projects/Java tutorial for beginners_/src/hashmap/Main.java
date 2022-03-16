package hashmap;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<String, String> students = new HashMap<>();

        // Add keys and values
        students.put("Anas", "20-00864");
        students.put("Anas", "20-00867");
        students.put("Mohamed", "20-00876");
        students.put("Abd", "20-00987");

        System.out.println(students);

        students.remove("Abd");

        System.out.println("students = " + students);

        System.out.println(students.get("Anas"));
    }
}
