import org.junit.Assert;
import org.junit.Test;
import java.util.regex.Pattern;

public class UserRegistrationTest {

    @Test
    public void First_Name_Check() {
        UserRegistration userRegistration = new UserRegistration();
        boolean result = userRegistration.firstName(Pattern.compile("^[A-Z][A-Za-z]{2,}"), "Abc");
        Assert.assertEquals(true,result);
    }

    @Test
    public void Last_Name_Check() {
        UserRegistration userRegistration = new UserRegistration();
        boolean result = userRegistration.lastName(Pattern.compile("^[A-Z][A-Za-z]{2,}"),"Def");
        Assert.assertEquals(true,result);
    }

    @Test
    public void Email_Check() {
        UserRegistration userRegistration = new UserRegistration();
        boolean result = userRegistration.email(Pattern.compile("^[0-9a-z]+[@][a-z]+[.]{1}[a-z]{2,}"),"vai123@gmail.com");
        Assert.assertEquals(true,result);
    }
}