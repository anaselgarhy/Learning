package variables;

public class Main {
    
    public static void main(String[] args) {
        boolean bol = true; // true or false [1 bit]

        byte b = 127; // -128 to 127 [1 byte]
        short s = 32767; // -32,768 to 32,767 [2 byte]
        int i = 2147483647; // -2 billion to 2 billion [4 bytes]
        long l = 9223372036854775807L; // -9 quintillion to 9 quintillion [8 bytes], Required the L in end

        float f = 3.1415927f; // 7 digits precision [4 bytes], Required the f in end
        double d = 3.141592653589793; // 15 digits precision [8 bytes]

        char c = 'a'; // 16 bits [2 bytes]
        String str = "Hello World"; // Unicode [varies]

        // Print
        System.out.println(bol);
        System.out.println(b);
        System.out.println(s);
        System.out.println(i);
        System.out.println(l);
        System.out.println(f);
        System.out.println(d);
        System.out.println(c);
        System.out.println(str);
    }
}
