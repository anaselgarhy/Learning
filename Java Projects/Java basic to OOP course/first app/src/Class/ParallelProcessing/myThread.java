package Class.ParallelProcessing;

public class myThread extends Thread {
    @Override
     public void run(){
        print();
    }
    synchronized private static void print(){
        int x = 0;
        while(x <= 10){
            System.out.println(x++);

            try {
                sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
                sout
            }
        }
    }
}
