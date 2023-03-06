package com.userRegistration;

import org.junit.Test;
import org.junit.Assert;
import java.util.regex.Pattern;
public class LastName {
    @Test
    public void givenFirstName_IfCorrect_ShouldReturn_True() {
        UserValidater userValidater = new UserValidater();
        boolean result = userValidater.validateFirstName("Kumar");
        Assert.assertEquals(true,result);
    }
    @Test
    public void givenFirstName_IfNotCorrect_ShouldReturn_False() {
        UserValidater userValidater = new UserValidater();
        boolean result = userValidater.validateFirstName("K");
        Assert.assertEquals(false,result);
    }
}


class UserValidater {
    private static final String LASTNAME_PATTERN = "[A-Z]{1}[a-z]+";

    public boolean validateFirstName(String lastName) {
        Pattern pattern = Pattern.compile(LASTNAME_PATTERN);
        return pattern.matcher(lastName).matches();
    }
}

