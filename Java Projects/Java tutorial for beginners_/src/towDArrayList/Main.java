package towDArrayList;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> food = new ArrayList<>();
        food.add("Pizza");
        food.add("Burger");
        food.add("Chips");
        System.out.println("food = " + food);

        ArrayList<String> drink = new ArrayList<>();
        drink.add("Coke");
        drink.add("Fanta");
        drink.add("Sprite");
        System.out.println("drink = " + drink);

        ArrayList<ArrayList<String>> list = new ArrayList<>();

        // Add food list to list
        list.add(food);
        // Add drink list to list
        list.add(drink);

        System.out.println("list = " + list);
    }
}
