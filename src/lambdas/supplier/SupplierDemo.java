package lambdas.supplier;

import java.time.LocalDateTime;
import java.util.function.Supplier;

public class SupplierDemo {
	public static void main(String[] args) {
		Supplier<LocalDateTime> f = () -> LocalDateTime.now(); 
		System.out.println(f.get());
	}

}
