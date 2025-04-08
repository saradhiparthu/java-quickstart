package concurrent.executors;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class FixedThreadExecutorExample {

    public static void main(String[] args) {
        Runnable aggregatorTask = () -> {
            System.out.println("Aggregation");
            try {
                Thread.sleep(9000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        };

        Runnable senderTask = () -> {
            System.out.println("sending Aggregation data to other system");
            try {
                Thread.sleep(9000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        };
        ExecutorService executor = Executors.newFixedThreadPool(3);
        executor.submit(aggregatorTask);
        executor.submit(senderTask);
    }
}
