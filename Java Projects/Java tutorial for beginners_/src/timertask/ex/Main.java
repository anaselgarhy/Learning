package timertask.ex;

import java.util.Calendar;
import java.util.Timer;
import java.util.TimerTask;

public class Main {
    public static void main(String[] args) {
        Timer timer = new Timer();

        TimerTask task = new TimerTask() {
            @Override
            public void run() {
                System.out.println("Task run :)");
            }
        };

        // timer.schedule(task, 3000); // 3 seconds

        Calendar calendar = Calendar.getInstance();

        calendar.set(Calendar.YEAR, 2023); // the next year :D
        calendar.set(Calendar.MONTH, Calendar.JANUARY); // in January
        calendar.set(Calendar.DAY_OF_MONTH, 1); // the first day of the month

        timer.schedule(task, calendar.getTime());
    }
}
