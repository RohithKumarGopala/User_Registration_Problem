package com.userRegistration;

import org.junit.Assert;
import org.junit.Test;
import java.util.regex.Pattern;

public class UserEmail {
    @Test
    public void givenEmail_IfCorrect_ShouldReturn_True() {
        UserValidater userValidater = new UserValidater();
        boolean result = userValidater.validateEmail("abc.xyz@bl.co.in");
        Assert.assertEquals(true, result);
    }

    @Test
    public void givenEmail_IfNotCorrect_ShouldReturn_False() {
        UserValidater userValidater = new UserValidater();
        boolean result = userValidater.validateEmail("Rohith@.com");
        Assert.assertEquals(false, result);
    }
}


class UserValidator{
    private static final String Email= "[abc]{3}.[a-z]{3}+@[bl]{2}.[co]{2}.[a-z]{2}+";

    public boolean validateEmail(String Email) {
        Pattern pattern = Pattern.compile(Email);
        return pattern.matcher(Email).matches();
    }
}

