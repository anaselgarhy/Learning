package threads;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.out.println(Thread.currentThread().getName());
        Thread.currentThread().setName("Mainnnnnnnnnnn");
        System.out.println(Thread.currentThread().getName());

        System.out.println(Thread.currentThread().getPriority());
        Thread.currentThread().setPriority(Thread.MIN_PRIORITY);
        System.out.println(Thread.currentThread().getPriority());
        Thread.currentThread().setPriority(Thread.MAX_PRIORITY);
        System.out.println(Thread.currentThread().getPriority());

        Thread.sleep(1000);

        System.out.println("Done");
    }
}
