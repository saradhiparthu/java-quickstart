package lambdas.predicate;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PredicateDemo {
	public static void main(String[] args) {
		Stream<String> cities = Stream.of("Sydney", "Dhaka", "New York", "London");
		Predicate<String> p = e -> e.startsWith("N");
		List<String> filterData = cities.filter(p).collect(Collectors.toList());
		System.out.println(filterData);

	}

}
