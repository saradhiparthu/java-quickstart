package lambdas.consumer;

import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.function.Consumer;

public class ConsumerMultithreadingSolution {
    public static void main(String[] args) {
        List<String> orders = List.of("Order1", "Order2", "Order3", "Order4");

        Consumer<String> processOrder = order -> {
            System.out.println(Thread.currentThread().getName() + " processing " + order);
            try {
                Thread.sleep(1000); // Simulate processing time
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        };

        ExecutorService executor = Executors.newFixedThreadPool(2);

        // Submitting tasks for concurrent processing
        orders.forEach(order -> executor.submit(() -> processOrder.accept(order)));

        executor.shutdown(); // Initiates an orderly shutdown
    }
}
