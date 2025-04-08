package stream.aggregation;

import java.util.stream.IntStream;

public class FactorialCalculationWithAccumulator {
    public static void main(String[] args) {
        int n=5;
       int factorial  = IntStream.rangeClosed(1,n).reduce( (e1, e2)-> e1 * e2).getAsInt();
        System.out.println(factorial);
    }
}
