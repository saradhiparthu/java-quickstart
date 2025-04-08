package oop.overloading;

public class WrapperAmbiguity {

    public static void test(Integer i, Double d) {
        System.out.println("Integer, Double");
    }

    public static void test(Double d, Integer i) {
        System.out.println("Double, Integer");
    }

    public static void main(String[] args) {
        // test(null, null); // 🚫 Ambiguous call
        //Why? null can be assigned to both Integer and Double
    }
}

