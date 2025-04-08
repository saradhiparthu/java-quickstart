package oop.overloading;

public class InheritanceDemo {

    public static void main(String[] args) {
        test(null); // Which method gets called?
        /*
        What happens here?
        Even though all 3 methods could accept null, Java chooses the most specific method.
        Why? Because:
        Integer is more specific than Number
        Number is more specific than Object

        Java picks the most specific applicable method, using the class hierarchy.
         */
    }

    public static void test(Object obj) {
        System.out.println("Object");
    }

    public static void test(Number num) {
        System.out.println("Number");
    }

    public static void test(Integer num) {
        System.out.println("Integer");
    }
}
