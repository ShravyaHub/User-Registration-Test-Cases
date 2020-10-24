package com.bridgelabz.userregistrationtest;

import com.bridgelabz.userregistration.UserRegistration;
import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationTest {

    @Test
    public void givenFirstName_WhenValid_ShouldReturnTrue() {
        UserRegistration userRegistration = new UserRegistration();
        boolean validation = userRegistration.validateFirstName("Shravya");
        Assert.assertTrue(validation);
    }

    @Test
    public void givenFirstName_WhenLessThanThreeLetters_ShouldReturnFalse() {
        UserRegistration userRegistration = new UserRegistration();
        boolean validation = userRegistration.validateFirstName("Sh");
        Assert.assertFalse(validation);
    }

    @Test
    public void givenFirstName_WhenFirstLetterNotUppercase_ShouldReturnFalse() {
        UserRegistration userRegistration = new UserRegistration();
        boolean validation = userRegistration.validateFirstName("shravya");
        Assert.assertFalse(validation);
    }

    @Test
    public void givenLastName_WhenValid_ShouldReturnTrue() {
        UserRegistration userRegistration = new UserRegistration();
        boolean validation = userRegistration.validateLastName("Kotha");
        Assert.assertTrue(validation);
    }

    @Test
    public void givenLastName_WhenLessThanThreeLetters_ShouldReturnFalse() {
        UserRegistration userRegistration = new UserRegistration();
        boolean validation = userRegistration.validateLastName("Ko");
        Assert.assertFalse(validation);
    }

    @Test
    public void givenLastName_WhenFirstLetterNotUppercase_ShouldReturnFalse() {
        UserRegistration userRegistration = new UserRegistration();
        boolean validation = userRegistration.validateLastName("kotha");
        Assert.assertFalse(validation);
    }

    @Test
    public void givenPhoneNumber_WhenValid_ShouldReturnTrue() {
        UserRegistration userRegistration = new UserRegistration();
        boolean validation = userRegistration.validatePhoneNumber("91 9591266655");
        Assert.assertTrue(validation);
    }

    @Test
    public void givenPhoneNumber_WhenNoCountryCode_ShouldReturnFalse() {
        UserRegistration userRegistration = new UserRegistration();
        boolean validation = userRegistration.validatePhoneNumber(" 9591266655");
        Assert.assertFalse(validation);
    }

    @Test
    public void givenPhoneNumber_WhenNoSpace_ShouldReturnFalse() {
        UserRegistration userRegistration = new UserRegistration();
        boolean validation = userRegistration.validatePhoneNumber("919591266655");
        Assert.assertFalse(validation);
    }

    @Test
    public void givenPhoneNumber_WhenLessThanTenDigits_ShouldReturnFalse() {
        UserRegistration userRegistration = new UserRegistration();
        boolean validation = userRegistration.validatePhoneNumber("91 959126665");
        Assert.assertFalse(validation);
    }

    @Test
    public void givenPassword_WhenValid_ShouldReturnTrue() {
        UserRegistration userRegistration = new UserRegistration();
        boolean validation = userRegistration.validatePassword("Shravyak1");
        Assert.assertTrue(validation);
    }

    @Test
    public void givenPassword_WhenLessThanEightCharacters_ShouldReturnFalse() {
        UserRegistration userRegistration = new UserRegistration();
        boolean validation = userRegistration.validatePassword("shravya");
        Assert.assertFalse(validation);
    }

    @Test
    public void givenPassword_WhenNoUppercaseLetters_ShouldReturnFalse() {
        UserRegistration userRegistration = new UserRegistration();
        boolean validation = userRegistration.validatePassword("shravyak");
        Assert.assertFalse(validation);
    }

    @Test
    public void givenPassword_WhenNoNumbers_ShouldReturnFalse() {
        UserRegistration userRegistration = new UserRegistration();
        boolean validation = userRegistration.validatePassword("Shravyak");
        Assert.assertFalse(validation);
    }

}
