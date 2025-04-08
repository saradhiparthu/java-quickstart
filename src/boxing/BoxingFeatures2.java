package boxing;

import java.util.ArrayList;
import java.util.List;

public class BoxingFeatures2 {
    public static void main(String[] args) {

        Integer i = Integer.valueOf(10);

        // 1. Unboxing  through method invocation
        int absVal = absoluteValue(i);
        System.out.println("absolute value of " + i + " = " + absVal);

        List<Double> ld = new ArrayList<>();
        ld.add(3.1416);    // PI is Autoboxing through method invocation.

        // 2.Unboxing  through assignment
        double phi = ld.get(0);
        System.out.println("phi = " + phi);
    }

    public static int absoluteValue(int i) {
        return (i < 0) ? -i : i;
    }
}
