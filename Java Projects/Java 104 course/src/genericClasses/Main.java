package genericClasses;

public class Main {
    public static void main(String[] args){
        First<Integer> f = new First<Integer>(); // Look here
        f.value = 20;
        First<Float> f2 = new First<>(); // Look here
        f2.value = 3.8f;

        // f = f2; // Error
        First<Integer> ff = new First<>();
        f = ff; // Look here

        System.out.println(f.demo(56)); // Look here
        System.out.println(f2.demo(43.8f)); // Look here

        Second<Integer, Float> s1 = new Second<>();
        s1.test(22, 48f);
        Second<String, String> s2 = new Second<>();
        s2.test("Anas", "Ahmed");
    }
}
