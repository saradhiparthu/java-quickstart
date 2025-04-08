package boxing;

public class BoxingFeatures1 {
    public static void main(String[] args) {
        // Autoboxing (Primitive to Object)
            int num = 10;
            Integer boxed = num; // Autoboxing: compiler converts int to Integer
            //the compiler does something like:
            //Integer boxed = Integer.valueOf(num);
        // Unboxing (Object to Primitive)
           Integer  boxed1 =Integer.valueOf(10);
           int unboxed = boxed; // Auto-unboxing: Integer to int

    }
}
