import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.regex.Pattern;

public class userRegistrationTest {
    private userRegistration userRegistration;

    @Before
    public void initialize() {
        userRegistration = new userRegistration();
    }

    @Test
    public void firstNameCheckWithFalseCondition() {
        Assert.assertFalse(userRegistration.firstName("a"));
    }

    @Test
    public void firstNameCheckWithTrueCondition() {
        Assert.assertTrue(userRegistration.firstName("Abc"));
    }

    @Test
    public void lastNameCheckWithFalseCondition() {
        Assert.assertFalse(userRegistration.lastName("def"));
    }

    @Test
    public void lastNameCheckWithTrueCondition() {
        Assert.assertTrue(userRegistration.lastName("DEF"));
    }

    @Test
    public void emailCheckWithFalseCondition() {
        Assert.assertFalse(userRegistration.email("abc.123@.gmail.com"));
    }

    @Test
    public void emailCheckWithTrueCondition() {
        Assert.assertTrue(userRegistration.email("abc.1234@gmail.com"));
    }

    @Test
    public void mobileNumberCheckWithFalseCondition() {
        Assert.assertFalse(userRegistration.mobileNumber("919874561230"));
    }

    @Test
    public void mobileNumberCheckWithTrueCondition() {
        Assert.assertTrue(userRegistration.mobileNumber("91 9874561230"));
    }

    @Test
    public void passwordCheckWithFalseCondition() {
        Assert.assertFalse(userRegistration.password("abcd@123"));
    }

    @Test
    public void passwordCheckWithTrueCondition() {
        Assert.assertTrue(userRegistration.password("Abcd@123"));
    }
}