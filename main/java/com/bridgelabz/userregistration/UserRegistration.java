package com.bridgelabz.userregistration;

public class UserRegistration {

    public static final String NAME_REGEX = "^[A-Z][a-z]{2,}$";
    public static final String EMAIL_REGEX = "^([a-z0-9]+[-._+]?[a-z0-9]+)+@[a-z0-9-]+.[a-z]{2,3}.[a-z]{2,3}$";

    public boolean validateFirstName(String firstName) {
        return firstName.matches(NAME_REGEX);
    }

    public boolean validateLastName(String lastName) {
        return lastName.matches(NAME_REGEX);
    }

    public boolean validateEmail(String email) {
        return email.matches(EMAIL_REGEX);
    }

}
