package com.company.springmvcweb.data;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class PasswordValidator {

//    requirements:
//        min length = 8
//        at least 1 number
//        at least 1 capital letter

    private int minPasswordLength = 8;

    public boolean validate(String password1, String password2){

        var length = validateLength(password1);
//        if (!length) {
//            System.out.println("Password length must be at least 8 characters!");
//        }
        var validation = validateCapitalLettersAndNumbers(password1);
//        if (!validation) {
//            System.out.println("Password must contain at least 1 Capital letter, 1 Small letter and 1 digit!");
//        }
        var match = validateMatch(password1, password2);
//        if (!match) {
//            System.out.println("Passwords do not match!");
//        }

        if (length && validation && match) {
            return true;
        }
        return false;
    }


    private boolean validateLength(String password) {
        return password.length() >= minPasswordLength;
    }

    private boolean validateMatch(String password1, String password2) {
        return (password1.equals(password2));
    }

    private static boolean validateCapitalLettersAndNumbers(String password) {
        var digitCount = 0;
        var smallLetterCount = 0;
        var capitalLetterCount = 0;
        char ch;
        for (int i = 0; i < password.length(); i++) {
            ch = password.charAt(i);
            if (Character.isDigit(ch)) {
                digitCount++;
            } else if (Character.isUpperCase(ch)) {
                capitalLetterCount++;
            } else if (Character.isLowerCase(ch)) {
                smallLetterCount++;
            }
            if (digitCount >= 1 && capitalLetterCount >= 1 && smallLetterCount >= 1)
                return true;
        }
        return false;
    }
}
