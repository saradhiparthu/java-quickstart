package boxing;

import java.util.*;

public class BoxingExample {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(10);   // Autoboxing: int -> Integer
        list.add(20);

        int sum = 0;
        for (Integer val : list) {
            sum += val; // Auto-unboxing: Integer -> int
        }

        System.out.println("Sum = " + sum);
    }
}
