import java.util.regex.Pattern;

public class UserRegistration {

    public boolean firstName(Pattern pattern, String name) {
        return pattern.matches(String.valueOf(pattern),name);
    }

    public boolean lastName(Pattern pattern, String name) {
        return pattern.matches(String.valueOf(pattern),name);
    }

    public boolean email(Pattern pattern, String emailAddress) {
        return pattern.matches(String.valueOf(pattern),emailAddress);
    }
}
