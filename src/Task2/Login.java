package Task2;
public class Login {
    public boolean authenticate(String username, String password) {
        return username.equals("admin") && password.equals("password123");
    }
}
