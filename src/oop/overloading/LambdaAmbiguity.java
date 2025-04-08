package oop.overloading;

interface A {
    void test();
}

interface B {
    void test();
}

public class LambdaAmbiguity {

    public static void call(A a) {
        System.out.println("Called A");
    }

    public static void call(B b) {
        System.out.println("Called B");
    }

    public static void main(String[] args) {
        // call(() -> System.out.println("Hello")); // ❌ Compilation Error!
        /*
        Why compilation error?
        Because:
            The lambda matches both A and B (they both have a single abstract method: void test())
            Java cannot decide which functional interface to use
            Result: ambiguous method call
         */
        // Fix it with casting:
        call((A) () -> System.out.println("Hello")); // Output: Called A
        call((B) () -> System.out.println("Hello")); // Output: Called B
    }
}
