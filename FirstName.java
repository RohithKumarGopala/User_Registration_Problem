package com.userRegistration;

import org.junit.Test;
import org.junit.Assert;
import java.util.regex.Pattern;

public class FirstName {
    @Test
    public void givenFirstName_IfCorrect_ShouldReturn_True() {
        UserValidater userValidater = new UserValidater();
        boolean result = userValidater.validateFirstName("Rohith");
        Assert.assertEquals(true, result);
    }

    @Test
    public void givenFirstName_IfNotCorrect_ShouldReturn_False() {
        UserValidater userValidater = new UserValidater();
        boolean result = userValidater.validateFirstName("R");
        Assert.assertEquals(false, result);
    }


    class UserValidater {
        private static final String FIRSTNAME_PATTERN = "[A-Z]{1}[a-z]+";

        public boolean validateFirstName(String firstName) {
            Pattern pattern = Pattern.compile(FIRSTNAME_PATTERN);
            return pattern.matcher(firstName).matches();
        }
    }
}

