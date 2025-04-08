package lambdas.function;

import java.util.function.Function;

public class FunctionOddOrEven {
    public static void main(String[] args) {
        Function<Integer, String> f = (Integer i) -> {
            if (i % 2 == 0) {
                return "Even number";
            } else {
                return "Odd number";
            }
        };
        System.out.println(f.apply(2));
    }
}
