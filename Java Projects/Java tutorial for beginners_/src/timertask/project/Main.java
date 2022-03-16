package timertask.project;

import java.util.Timer;
import java.util.TimerTask;

public class Main {
    public static void main(String[] args) {
        Timer timer = new Timer();

    TimerTask task =
        new TimerTask() {
          int count = 10;

          @Override
          public void run() {
            if (count <= 0) {
              System.out.println("Happy New Year!");
              timer.cancel();
            } else {
              System.out.println(count--);
            }
          }
        };

        timer.scheduleAtFixedRate(task, 0, 1000);
    }
}











