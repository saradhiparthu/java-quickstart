package lambdas.function;

import java.time.LocalDate;
import java.util.Random;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class FunctionDemo {

	public static void main(String[] args) {
		// Function
		Function<String, String> f = t -> t.toUpperCase();
		System.out.println(f.apply("Kushal"));

		// BiFunction
		BiFunction<Integer, Integer, Integer> biFunction = (t1, t2) -> {
			return t1 + t2;
		};
		
		System.out.println("Sub of two number's using BiFunction " + biFunction.apply(10, 20));
		
		Stream<Employee> employees = Stream.of(new Employee("Kushal", 1000.00, "India", LocalDate.of(2015, 07, 14)));
		
		Supplier<Integer> primaryKeySupplier = () -> {
			Random r = new Random();
			return r.nextInt();
		};
		Supplier<String> emailSupplier = () -> {
			return "yourname@gmail.com";
		};
		Function<Employee, Employee> ef1 = e -> {
			e.setSalary(e.getSalary() * 25);
			e.setId(primaryKeySupplier);
			return e;
		};
		Function<Employee, Employee> ef2 = e -> {
			e.setEmail(emailSupplier);
			return e;
		};
		// Function chains with andThen()
		employees.map(ef1.andThen(ef2)).forEach( t -> System.out.println(t));
		
		Function<Integer, Integer> f1 = i -> {
            System.out.println("Inside F1");
            return i * i;
        };

        Function<Integer, Integer> f2 = i -> {
            System.out.println("Inside F2");
            return i * i;
        };

        // Function andThen vs compose
        System.out.println(f1.andThen(f2).apply(2));
        // Execute f1 function first, take the result of f1 and then apply it to f2 function (The result of f1 function will be the input to f2 function)
        System.out.println(f1.compose(f2).apply(2));
        // Execute f2 function and then take the result of f2 and execute f1 (The result of f2 will be the input to f1 function)
    }

}
