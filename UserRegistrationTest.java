import org.junit.Assert;
import org.junit.Test;

import java.util.regex.Matcher;
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
        boolean result = userRegistration.email(Pattern.compile("^[0-9a-z]+[@][a-z]+[.][a-z]{2,}"),"vai123@gmail.com");
        Assert.assertEquals(true,result);
    }

    @Test
    public void Mobile_Number_Check() {
        UserRegistration userRegistration = new UserRegistration();
        boolean result = userRegistration.mobileNumber(Pattern.compile("^[0-9]{2}[ ][0-9]{10}"),"91 1234567890");
        Assert.assertEquals(true,result);
    }

    @Test
    public void Password_Check() {
        UserRegistration userRegistration = new UserRegistration();
        boolean result = userRegistration.password(Pattern.compile("(?=.*[A-Z].*)(?=.*[0-9].*)[A-Za-z0-9]{8,}"),"AbCd1234");
        Assert.assertEquals(true,result);
    }
}