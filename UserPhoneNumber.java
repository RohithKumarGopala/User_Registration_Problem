package com.userRegistration;

import org.junit.Assert;
import org.junit.Test;
import java.util.regex.Pattern;
public class UserPhoneNumber {
    @Test
    public void userPhone_IfCorrect_ShouldReturn_True() {
        UserValidate userValidate = new UserValidate();
        boolean result = userValidate.validatePhone("91 6304871072");
        Assert.assertEquals(true,result);
    }
    @Test
    public void userPhone_IfNotCorrect_ShouldReturn_False() {
        UserValidate userValidate = new UserValidate();
        boolean result = userValidate.validatePhone("234234323422234");
        Assert.assertEquals(false,result);
    }
}


class UserValidate{
    private static final String Email= "[91]{2}\\s[0-9]{10}+";

    public boolean validatePhone(String Phone) {
        Pattern pattern = Pattern.compile(Email);
        return pattern.matcher(Email).matches();
    }
}

