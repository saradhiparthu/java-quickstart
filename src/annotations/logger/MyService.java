package annotations.logger;

public class MyService {

    @MyLogger("Starting business logic")
    public void doWork() {
        System.out.println("Working...");
    }
}
