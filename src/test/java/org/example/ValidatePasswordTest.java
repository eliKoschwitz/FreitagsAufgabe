package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class ValidatePasswordTest {

    @Test
    void checkPWLengthIsGreaterThanOr8(){
        //GIVEN
        String pw = "thatisthepw";
        //WHEN
        boolean actual = ValidatePassword.checkPWLength(pw);
        //THEN
        Assertions.assertTrue(actual);

    }


    @Test
    void checkPWLengthIsLowerThan8(){
        //GIVEN
        String pw = "that";
        //WHEN
        boolean actual = ValidatePassword.checkPWLength(pw);
        //THEN
        Assertions.assertFalse(actual);
    }

    @Test
    void checkPWHasNumbers(){
        //GIVEN
        String pw = "thatis8thepw";
        //WHEN
        boolean actual = ValidatePassword.checkPWNumbers(pw);
        //THEN
        Assertions.assertTrue(actual);
    }

    @Test
    void checkPWHasNoNumbers(){
        //GIVEN
        String pw = "thatisthepw";
        //WHEN
        boolean actual = ValidatePassword.checkPWNumbers(pw);
        //THEN
        Assertions.assertFalse(actual);
    }

    @Test
    void checkPWHasUpperCaseChars(){
        //GIVEN
        String pw = "thatIsThePw";
        //WHEN
        boolean actual = ValidatePassword.checkPWUpperCase(pw);
        //THEN
        Assertions.assertTrue(actual);
    }

    @Test
    void checkPWHasNoUpperCaseChars(){
        //GIVEN
        String pw = "thatisthepw";
        //WHEN
        boolean actual = ValidatePassword.checkPWUpperCase(pw);
        //THEN
        Assertions.assertFalse(actual);
    }

    @Test
    void checkPWHasSpecialChars(){
        //GIVEN
        String pw = "tha$tisthepw_]$";
        //WHEN
        boolean actual = ValidatePassword.checkPWSpecialChars(pw);
        //THEN
        Assertions.assertTrue(actual);
    }

    @Test
    void checkPWHasNoSpecialChars(){
        //GIVEN
        String pw = "thatisthepw";
        //WHEN
        boolean actual = ValidatePassword.checkPWSpecialChars(pw);
        //THEN
        Assertions.assertFalse(actual);
    }
}