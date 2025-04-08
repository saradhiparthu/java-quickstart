package collections;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class UnmodifiableCollections {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("Kushal");
		List<String> copyList = List.copyOf(list);
		// copyList.add("pulivarthi");// Runtime Exception'UnsupportedOperationException'.

		List<Integer> ages = new ArrayList<>();
		List<Integer> evenList = ages.stream().filter(i -> i % 2 == 0).collect(Collectors.toUnmodifiableList());
		//evenList.add(22); // Runtime Exception 'UnsupportedOperationException'.
		
		 Integer firstEven = ages.stream()
			      .filter(i -> i % 2 == 0)
			      .findFirst()
			      .orElseThrow();//  NoSuchElementException: No value present

	}

}
