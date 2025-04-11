package basic;

import java.util.Arrays;
import java.util.List;

import static java.util.stream.Collectors.toList;

public class DoubleNumbersOfArrayElements {

	public static void main(String[] args) {
		Integer ranks[] = { 12, 35, 1, 10, 34, 1 };
		List<Integer> list =	Arrays.stream(ranks).map( e-> e * 2).collect(toList());
		list.forEach( e -> System.out.println(e));

	}

}
