package annotations.email;

public class EmailValidationProcessor {
    public static void main(String[] args) throws IllegalAccessException {
        User user = new User("saradhiparthu@gmail.com");
        EmailValidator.validate(user);  // It should print: "Please provide a valid email!"
    }
}
