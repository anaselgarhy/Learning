package wrapperClasses;

public class Main1 {
    public static void main(String[] args) {
        Byte b = new Byte("1"); // Or Byte b = 1; // autoboxing
        Short s = new Short("2"); // Or Short s = 2; // autoboxing
        Integer i = new Integer("3"); // Or Integer i = 3; // autoboxing
        Long l = new Long("4"); // Or Long l = 4; // autoboxing
        Float f = new Float("5.5"); // Or Float f = 5.5; // autoboxing
        Double d = new Double("6.6"); // Or Double d = 6.6; // autoboxing
        Boolean bool = new Boolean("true"); // Or Boolean bool = true; // autoboxing
        Character c = new Character('a'); // Or Character c = 'a'; // autoboxing

        System.out.println(b);
        System.out.println(s);
        System.out.println(i);
        System.out.println(l);
        System.out.println(f);
        System.out.println(d);
        System.out.println(bool);
        System.out.println(c);
    }
}
