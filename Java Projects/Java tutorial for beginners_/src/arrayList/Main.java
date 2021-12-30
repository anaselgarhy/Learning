package arrayList;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> food = new ArrayList<>();

        food.add("Pizza"); // Add pizza to the list
        food.add("Burger"); // Add burger to the list
        food.add("Chips"); // Add chips to the list

        food.set(0, "Humburger"); // Change the first item in the list to "Humburger"



        // Print the list
        for (int i = 0; i < food.size(); i++) {
            System.out.println(food.get(i));
        }

        // Remove the first item in the list
        food.remove(0);

        // Print the list again
        for (String foodItem : food) {
            System.out.println(foodItem);
        }

        // Clear the list
        food.clear();

        // Print list size
        System.out.println(food.size());
    }
}
