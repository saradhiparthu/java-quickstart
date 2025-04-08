package oop.overloading;

public class PrimitiveAmbiguity {
    public static void test(int a, long b) {
        System.out.println("int, long");
    }

    public static void test(long a, int b) {
        System.out.println("long, int");
    }

    public static void main(String[] args) {
        //test(10, 20); // 🚫 Compilation Error: Reference to test is ambiguous
        // Fix it with casting:
        test(10, 20L);  // Matches: int, long
        test(10L, 20);  // Matches: long, int

    }
}
