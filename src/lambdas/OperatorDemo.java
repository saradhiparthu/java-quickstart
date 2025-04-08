package lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;

public class OperatorDemo {

	public static void main(String[] args) {
		List<Integer> values = Arrays.asList(3, 5, 8, 9, 12);
		BinaryOperator<Integer> b = (i, j) -> i + j;
		int sum = values.stream().reduce(0, b);
		System.out.println(sum);

		UnaryOperator<String> u = (str) -> str.toLowerCase();
		System.out.println(u.apply("KUSHAL"));
	}
}
