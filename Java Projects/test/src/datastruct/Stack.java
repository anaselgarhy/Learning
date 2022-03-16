package datastruct;
public class Stack <T> {
    private int size;
    private T[] array;
    private int stackElementsNumber;

    public Stack(int size) {
        this.size = size;
        this.array = (T[]) new Object[size];
        this.stackElementsNumber = 0;
    }

    public void push(T element) {
        if (this.size <= stackElementsNumber) {
            throw new IllegalArgumentException("Stack is full");
        }
        this.array[this.stackElementsNumber] = element;
        this.stackElementsNumber++;
    }

    public T pop() {
        if (this.stackElementsNumber == 0) {
            throw new IllegalArgumentException("No elements");
        }
        T element = this.array[this.stackElementsNumber - 1];
        this.array[this.size - 1] = null;
        this.stackElementsNumber--;
        return element;
    }

    public int size() {
        return this.stackElementsNumber;
    }
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>(5);
        stack.push("a");
        stack.push("b");
        stack.push("c");
        stack.push("d");
        stack.push("e");
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }
}
