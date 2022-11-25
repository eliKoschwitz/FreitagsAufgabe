package org.example;

public class ValidatePassword {

    public static boolean checkPWLength(String pw) {
        boolean flag = false;
        if (pw.length() >= 8) {
            flag = true;
        } else {
            flag = false;
        }
        return flag;
    }

    public static boolean checkPWNumbers(String pw) {
        boolean flag = false;
        char[] charArr = pw.toCharArray();

        for (char oneChar : charArr) {
            if (Character.isDigit(oneChar)) {
                flag = true;
                break;
            } else {
                flag = false;
            }
        }
        return flag;
    }

    public static boolean checkPWUpperCase(String pw) {
        boolean flag = false;
        char[] charArr = pw.toCharArray();

        for (char oneChar : charArr) {
            if (Character.isUpperCase(oneChar)) {
                flag = true;
                break;
            } else {
                flag = false;
            }
        }
        return flag;
    }

    public static boolean checkPWSpecialChars(String pw) {
        boolean flag = false;
        char[] charArr = pw.toCharArray();

        for (char oneChar : charArr) {
            if (Character.isDigit(oneChar) | Character.isLetter(oneChar)) {
                flag = false;
            } else {
                flag = true;
                break;
            }
        }
        return flag;
    }

        public static void main (String[]args){
            System.out.println("Elias Code");
        }

}