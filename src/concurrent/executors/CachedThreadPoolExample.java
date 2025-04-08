package concurrent.executors;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CachedThreadPoolExample {
    public static void main(String[] args) {
        ExecutorService executorService =Executors.newCachedThreadPool();
        executorService.submit(()->{
            System.out.println("Executing Task  on thread " + Thread.currentThread().getName());
        });
    }
}
