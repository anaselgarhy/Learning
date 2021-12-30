package stringMethods;

public class Main {
    public static void main(String[] args) {
        String name = "Anas";

        // Get the length of the string
        System.out.println("Length of the string: " + name.length()); // 4

        // Get the character at index 2
        System.out.println("Character at index 2: " + name.charAt(2)); // a

        // Check if the string contains the substring "Ana"
        System.out.println("Does the string contain the substring \"Ana\": " + name.contains("Ana")); // true

        // Check if the string starts with "Ana"
        System.out.println("Does the string start with \"Ana\": " + name.startsWith("Ana")); // true

        // Check if the string ends with "as"
        System.out.println("Does the string end with \"as\": " + name.endsWith("as")); // true

        // Get the index of the first occurrence of the substring "A"
        System.out.println("Index of the first occurrence of the substring \"A\": " + name.indexOf("A")); // 0

        // Compare the string with another string and return true if they are equal
        System.out.println("Compare the string with another string and return true if they are equal: " + name.equals("Ahmed")); // false

        // Compare the string with another string and return negative if the first string is smaller than the second
        System.out.println("Compare the string with another string and return negative if the first string is smaller than the second: " + name.compareTo("aa")); // -32

        // Compare the string with another string and return positive if the first string is greater than the second
        System.out.println("Compare the string with another string and return positive if the first string is greater than the second: " + name.compareTo("AAzz")); // 45

        // Compare the string with another string and return 0 if they are equal
        System.out.println("Compare the string with another string and return 0 if they are equal: " + name.compareTo("Anas")); // 0

        // Replace the first occurrence of the substring "Ana" with "Ahmed"
        System.out.println("Replace the first occurrence of the substring \"Ana\" with \"Ahmed\": " + name.replaceFirst("Ana", "Ahmed")); // Ahmed

        // Replace all occurrences of the substring "Ana" with "Ahmed"
        System.out.println("Replace all occurrences of the substring \"Ana\" with \"Ahmed\": " + name.replace("Ana", "Ahmed")); // Ahmed

        // Split the string into an array of substrings
        System.out.println("Split the string into an array of substrings: " + name.split("a")); // [An, s]

        // Convert the string to lowercase
        System.out.println("Convert the string to lowercase: " + name.toLowerCase()); // anas

        // Convert the string to uppercase
        System.out.println("Convert the string to uppercase: " + name.toUpperCase()); // ANAS

        String str = "          String Methods          ";

        // Trim the string (remove leading and trailing spaces)
        System.out.println("Trim the string (remove leading and trailing spaces): " + str.trim()); // String Methods

        str = "";
        // Check if the string is empty (length is 0)
        System.out.println("Check if the string is empty: " + str.isEmpty()); // true

        str = "        ";
        // Check if the string is blank (length is 0 or contains only spaces)
        System.out.println("Check if the string is blank: " + str.isBlank()); // true


    }
}
