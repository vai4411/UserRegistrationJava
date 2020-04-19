import org.junit.Assert;
import org.junit.Test;

import java.util.regex.Pattern;

public class UserRegistrationTest {

    @Test
    public void firstNameCheck() {
        UserRegistration userRegistration = new UserRegistration();
        boolean result = userRegistration.firstName(Pattern.compile("[A-Z][A-Za-z]{2,}"),"Vaibhav");
        Assert.assertEquals(true,result);
    }
}