package optional;

import java.util.Optional;

public class flatMap {
    public static void main(String[] args) {

        User userObject = new User("Alice", Optional.of(new Address("New York")));
        Optional<User> userOpt = Optional.of(userObject);
        Optional<String> city = userOpt.flatMap(User::address)
                .map(Address::city)
                .map(String::toUpperCase);
        System.out.println(city);
    }
}

record User(String name, Optional<Address> address) {
}

record Address(String city) {
}