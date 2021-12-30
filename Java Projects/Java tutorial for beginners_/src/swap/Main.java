package swap;

public class Main {
    public static void main(String[] args) {
        String cup1 = "Water";
        String cup2 = "Kool-aid";

        // Print values after swap
        System.out.println("cup1: " + cup1);
        System.out.println("cup2: " + cup2);

        // Swap the values of cup1 and cup2
        String temp = cup1; // Store the value of cup1 to temp
        cup1 = cup2; // Store the value of cup2 in cup1
        cup2 = temp; // Restore the value of cup1 from temp and store it in cup2

        // Print values before swap
        System.out.println("cup1: " + cup1);
        System.out.println("cup2: " + cup2);
    }
}
