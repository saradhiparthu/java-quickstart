package concurrent.queue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.*;

public class ProducerConsumerExample {
    public static void main(String[] args) {
        LinkedBlockingQueue<String> queue = new LinkedBlockingQueue<>(5);

        ExecutorService executor = Executors.newFixedThreadPool(2);

        // Producer
        executor.submit(() -> {
            for (int i = 1; i <= 10; i++) {
                try {
                    String item = "Item-" + i;
                    queue.put(item);
                    System.out.println("Produced: " + item);
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
        });

        // Consumer
        executor.submit(() -> {
            while (true) {
                try {
                    String item = queue.take();
                    System.out.println("Consumed: " + item);
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
        });
    }
}
