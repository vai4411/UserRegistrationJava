import java.nio.file.PathMatcher;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static java.lang.String.*;

public class userRegistration {
    private Pattern pattern;

    public boolean firstName(String name) {
        pattern = pattern.compile("^[A-Z][A-Za-z]{2,}");
        return pattern.matches(valueOf(pattern),name);
    }

    public boolean lastName(String name) {
        pattern = pattern.compile("^[A-Z][A-Za-z]{2,}");
        return pattern.matches(valueOf(pattern),name);
    }

    public boolean email(String emailAddress) {
        pattern = pattern.compile("^[0-9a-z]+[+_.-]?[0-9a-z]+[@][0-9a-z]+[.][a-z]{2,}[.]?[a-z]+$");
        return pattern.matches(valueOf(pattern),emailAddress);
    }

    public boolean mobileNumber(String number) {
        pattern = pattern.compile("^[0-9]{2}[ ][0-9]{10}");
        return pattern.matches(valueOf(pattern),number);
    }

    public boolean password(String password) {
        pattern = pattern.compile("(?=.*[A-Z].*)(?=.*[0-9].*)([a-zA-Z0-9]{4,}[!@#$%^&*()_+][a-zA-Z0-9]{3,})");
        return pattern.matches(valueOf(pattern),password);
    }
}
