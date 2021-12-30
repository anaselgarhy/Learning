package Class.ParallelProcessing;

public class Main {
    public static void main(String[] args){
        myThread thread1 = new myThread();
        myThread thread2 = new myThread();
        thread1.start();
        thread2.start();

    }
}
