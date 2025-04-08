package annotations.email;

import java.lang.reflect.Field;
import java.util.regex.Pattern;

public class EmailValidator {

    // Regular expression for basic email validation
    private static final String EMAIL_REGEX = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
    private static final Pattern EMAIL_PATTERN = Pattern.compile(EMAIL_REGEX);

    public static void validate(Object obj) throws IllegalAccessException {
        // Get all fields of the class
        Field[] fields = obj.getClass().getDeclaredFields();

        for (Field field : fields) {
            if (field.isAnnotationPresent(Email.class)) {
                field.setAccessible(true); // Make the field accessible if private

                // Get the field value (email address)
                String emailValue = (String) field.get(obj);

                // Validate email format
                if (!EMAIL_PATTERN.matcher(emailValue).matches()) {
                    // Get custom error message
                    Email emailAnnotation = field.getAnnotation(Email.class);
                    System.out.println(emailAnnotation.message());
                }else {
                    System.out.println("your email is valid");
                }
            }
        }
    }
}

