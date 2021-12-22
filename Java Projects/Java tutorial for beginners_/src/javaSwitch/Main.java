package javaSwitch;

public class Main {
    public static void main(String[] args) {
        String day = "Monday";
        switch (day) {
            case "Saturday" -> System.out.println("It's the start of the weekend");
            case "Monday" -> System.out.println("It's a monday");
            case "Tuesday" -> System.out.println("It's a tuesday");
            case "Wednesday" -> System.out.println("It's a wednesday");
            case "Thursday" -> System.out.println("It's a thursday");
            case "Friday" -> System.out.println("It's a friday");
            default -> System.out.println("It's not a day of the week");
        }
    }
}
