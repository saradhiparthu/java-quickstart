@FunctionalInterface
interface Greeting {
    void sayHello(String name);

    default void sayGoodbye(String name) {
        System.out.println("Goodbye, " + name);
    }

    static void printWelcome() {
        System.out.println("Welcome!");
    }
}
