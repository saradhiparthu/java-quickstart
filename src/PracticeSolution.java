import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class PracticeSolution {
    public static void main(String[] args) {
        List<Integer> even = List.of(2, 4, 6, 8, 10);
        List<Integer> odd = List.of(1, 3, 5, 7, 9);
        Map<Integer, Integer> map = IntStream.range(0, Math.min(even.size(), odd.size())).boxed()
                .collect(Collectors.toMap(
                        oIndex -> odd.get(oIndex),
                        eIndex -> even.get(eIndex)
                ));
        System.out.println(map);
        List<String> list = Arrays.asList("Apple", "Banana", "Cherry");
        Map<Integer, String> resultMap = list.stream()
                .collect(Collectors.toMap(k -> k.length(), v -> v,
                        (oldValue, newValue) -> oldValue + "," + newValue,
                        TreeMap::new
                ));
        System.out.println(resultMap);
        List<SalesTransaction> transactions = Arrays.asList(
                new SalesTransaction("North", 1000),
                new SalesTransaction("South", 1500),
                new SalesTransaction("North", 2000),
                new SalesTransaction("East", 1200),
                new SalesTransaction("South", 1000)
        );
        Map<String, Integer> result = transactions.stream()
                .collect(Collectors.toMap(SalesTransaction::getRegion,
                        SalesTransaction::getSales,
                        (previousSales, currentSales) -> previousSales + currentSales));
        System.out.println(result);
        Map<String, Integer> collect = result.entrySet().
                stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (e1, e2) -> e1,
                        LinkedHashMap::new));

        System.out.println(collect);
        String[] keys = {"Java", "Python", "Java", "C++"};
        Map<String, Long> frequency = Arrays.stream(keys).collect(
                Collectors.groupingBy(Function.identity(), Collectors.counting()
                ));
        System.out.println(frequency);
        List<Product> products = new ArrayList<>();
        products.add(new Product("Laptop", "Electronics"));
        products.add(new Product("TV", "Electronics"));
        products.add(new Product("Shampoo", "Cosmetics"));

        Map<String, String> productsData = products.stream()
                .collect(Collectors.toMap(
                        f1 -> f1.category, f2 -> f2.name,
                        (existing, incomming) -> existing + "," + incomming
                ));
        System.out.println(productsData);

        List<String> animals = List.of("Dog", "Cat", "Dog", "Elephant");
      /*
                stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        Map<String,Long> out1=    c.entrySet().stream().
                sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())).collect(Collectors.toMap(
                Map.Entry::getKey,
                Map.Entry::getValue,
                (e1, e2) -> e1,
                LinkedHashMap::new));
        System.out.println(out1);
*/
        Map<String, Integer> out1 = animals.stream().collect(
                        Collectors.toMap(
                                e -> e,
                                e -> 1,
                                Integer::sum
                        )
                ).entrySet()
                .stream().
                sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
                        (e1, e2) -> e1,
                        LinkedHashMap::new));
        System.out.println(out1);

    }


}

class Product {
    String name;
    String category;

    Product(String name, String category) {
        this.name = name;
        this.category = category;
    }

}

class SalesTransaction {
    private String region;
    private int sales;

    public SalesTransaction(String region, int sales) {
        this.region = region;
        this.sales = sales;
    }

    public String getRegion() {
        return region;
    }

    public int getSales() {
        return sales;
    }
}