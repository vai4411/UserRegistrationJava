import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class validatedEmailTest {
    private String email;
    private boolean result;
    private userRegistration userRegister;

    public validatedEmailTest(String email, boolean result) {
        this.email = email;
        this.result = result;
    }

    @Before
    public void initialize() {
        userRegister = new userRegistration();
    }

    @Parameterized.Parameters
    public static Collection input() {
        return Arrays.asList(new Object[][] {{"abc@yahoo.com",true},
                {"abc-100@yahoo.com",true},
                {"abc.100@yahoo.com",true},
                {"abc111@abc.com",true},
                {"abc-100@abc.net",true},
                {"abc.100@abc.com.au",true},
                {"abc@1.com",true},
                {"abc@gmail.com.com",true},
                {"abc+100@gmail.com",true},
                {"abc",false},
                {"abc@.com.my",false},
                {"abc123@gmail.a",false},
                {"abc123@.com",false},
                {"abc123@.com.com",false},
                {".abc@abc.com",false},
                {"abc()*@gmail.com",false},
                {"abc@%*.com",false},
                {"abc..2002@gmail.com",false},
                {"abc.@gmail.com",false},
                {"abc@abc@gmail.com",false},
                {"abc@gmail.com.1a",false},
                {"abc@gmail.com.aa.au",false}});
    }

    @Test
    public void emailCheck() {
        Assert.assertEquals(result,userRegister.email(email));
    }
}
