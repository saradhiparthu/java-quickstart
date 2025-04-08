package lambdas.consumer;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class ConsumerDemo {

	public static void main(String[] args) {
		// Represents an operation that accepts a single input argument and returns no result.
		Consumer<String> c = (s) -> System.out.println(s);
		c.accept("Kushal");

		Consumer<String> c2 = (x) -> System.out.println(x.toLowerCase());
		c2.andThen(c2).andThen(c2).accept("Java");
		
		// Represents an operation that accepts two input arguments and returns no result. 
		BiConsumer<String, String> biConsumer = (a,b) -> System.out.println(a+b);
		biConsumer.accept("Parth Saradhi ", "Pulivarthi");
	}
}
