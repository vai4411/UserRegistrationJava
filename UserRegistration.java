import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static java.lang.String.*;

public class UserRegistration {

    public boolean firstName(Pattern pattern, String name) {
        return pattern.matches(valueOf(pattern),name);
    }

    public boolean lastName(Pattern pattern, String name) {
        return pattern.matches(valueOf(pattern),name);
    }

    public boolean email(Pattern pattern, String emailAddress) {
        return pattern.matches(valueOf(pattern),emailAddress);
    }

    public boolean mobileNumber(Pattern pattern, String number) {
        return pattern.matches(valueOf(pattern),number);
    }

    public boolean password(Pattern pattern, String password) {
        return pattern.matches(valueOf(pattern),password);
    }
}
