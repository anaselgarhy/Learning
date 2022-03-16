package generics.methods;

public class Main {
    public static void main(String[] args) {
        Integer[] intArray = {1, 2, 5, 7, 8};
        Double[] doubleArray = {8.7, 7.6, 5.4};
        Character[] characters = {'A', 'B', 'C'};
        String[] names = {"Anas", "Ahmed"};

        printArray(intArray);
        printArray(doubleArray);
        printArray(characters);
        printArray(names);

        System.out.println(getFirstElement(intArray));
        System.out.println(getFirstElement(doubleArray));
        System.out.println(getFirstElement(characters));
        System.out.println(getFirstElement(names));
    }

    private static <Think> void printArray(Think[] array) {
        for (Think think : array) {
            System.out.print(think + " ");
        }
        System.out.println();
    }

    private static <T> T getFirstElement(T[] array) {
        return  array[0];
    }
}
