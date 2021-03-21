package com.company;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StrongPasswordValidator {

    private static String regex = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,20}$";
    private Pattern pattern;
    private Matcher matcher;

    public StrongPasswordValidator() {
        pattern = Pattern.compile(regex,Pattern.CASE_INSENSITIVE);
    }

    public boolean validPassword(String password){
        matcher = pattern.matcher(password);
        return  matcher.matches();
    }

}
