package randomGen;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random rand = new Random(); // Create instance of Random class

        int randomInteger = rand.nextInt(); // Generate random integer between -2147483648 and 2147483647
        System.out.println("Random integer: " + randomInteger);

        randomInteger = rand.nextInt(100); // Generate random integer between 0 and 99
        System.out.println("Random integer between 0 and 99: " + randomInteger);

        double randomDouble = rand.nextDouble(); // Generate random double between 0.0 and 1.0
        System.out.println("Random double: " + randomDouble);

        randomDouble = rand.nextDouble(2.00); // Generate random double between 0.0 and 2.0
        System.out.println("Random double between 0.0 and 2.0: " + randomDouble);

        float randomFloat = rand.nextFloat(); // Generate random float between 0.0 and 1.0
        System.out.println("Random float: " + randomFloat);

        randomFloat = rand.nextFloat(2.00f); // Generate random float between 0.0 and 2.0
        System.out.println("Random float between 0.0 and 2.0: " + randomFloat);

        long randomLong = rand.nextLong(); // Generate random long between -9223372036854775808 and 9223372036854775807
        System.out.println("Random long: " + randomLong);

        randomLong = rand.nextLong(100); // Generate random long between 0 and 99
        System.out.println("Random long between 0 and 99: " + randomLong);

        boolean randomBoolean = rand.nextBoolean(); // Generate random boolean
        System.out.println("Random boolean: " + randomBoolean);
    }
}
