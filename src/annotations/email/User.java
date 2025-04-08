package annotations.email;

public class User {
    @Email
    private String email;

    User(String email) {
        this.email = email;
    }

    public String getEmail() {
        return this.email;
    }

}
