package randomGen;

import java.util.Random;

public class RandomArrays {
    public static void main(String[] args) {
        Random rand = new Random();

        byte[] byteArray = new byte[10];
        rand.nextBytes(byteArray); // Generate random bytes and put them in byteArray
        // Print the random bytes in byteArray
        for (byte b :byteArray) {
            System.out.print(b + " ");
        }
    }
}
