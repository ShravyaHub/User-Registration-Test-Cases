package com.bridgelabz.userregistration;

public class UserRegistration {

    public static final String NAME_REGEX = "^[A-Z][a-z]{2,}$";

    public boolean validateFirstName(String firstName) {
        return firstName.matches(NAME_REGEX);
    }

    public boolean validateLastName(String lastName) {
        return lastName.matches(NAME_REGEX);
    }


}
