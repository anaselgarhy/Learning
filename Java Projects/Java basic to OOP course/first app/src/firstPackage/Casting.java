package firstPackage;

public class Casting {
    public static void main(String[] args){
        int num1 = 333;
        double d1 = 32.98;
        String str1 = "2227";
        String str2;

        // int to string
        str2 = String.valueOf(num1);
        System.out.println(str2);
        // double to string
        str2 = String.valueOf(d1);
        System.out.println(str2);
        // string to integer
        num1 = Integer.valueOf(str1);
        System.out.println(num1);
        num1 = Integer.parseInt(str1);
        System.out.println(num1);
        // string to double
        d1 = Double.valueOf(str1);
        System.out.println(d1);
        d1 = Double.parseDouble(str1);
        System.out.println(d1);
    }
}
