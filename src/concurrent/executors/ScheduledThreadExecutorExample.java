package concurrent.executors;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ScheduledThreadExecutorExample {
    public static void main(String[] args) {
        ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);
        ScheduledRecursiveFolderWatcher watcher = new ScheduledRecursiveFolderWatcher();
        scheduler.scheduleAtFixedRate(watcher, 0, 1, TimeUnit.SECONDS);

    }
}

class ScheduledRecursiveFolderWatcher implements Runnable {

    public ScheduledRecursiveFolderWatcher() {

    }

    @Override
    public void run() {
        System.out.println("Watching");
    }
}