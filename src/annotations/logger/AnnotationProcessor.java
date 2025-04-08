package annotations.logger;

import java.lang.reflect.Method;

public class AnnotationProcessor {
    public static void main(String[] args) throws Exception {
        MyService service = new MyService();
        Method method = service.getClass().getMethod("doWork");

        if (method.isAnnotationPresent(MyLogger.class)) {
            MyLogger logger = method.getAnnotation(MyLogger.class);
            System.out.println("LOG: " + logger.value()); // Custom log message
        }

        method.invoke(service); // Call actual method
    }
}
