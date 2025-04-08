package lambdas.function;

import java.util.function.Function;

public class FunctionExample {

    public static void main(String[] args) {
        Function<String, String> f = (String s) -> {
            return s.toUpperCase();
        };
        System.out.println(f.apply("hello"));
    }

}
