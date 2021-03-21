package com.company;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailValidator {

    private static String regex = "^[\\w!#$%&’*+/=?`{|}~^-]+(?:\\.[\\w!#$%&’*+/=?`{|}~^-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,6}$";
    private Pattern pattern;
    private Matcher matcher;

    public EmailValidator() {
        pattern = Pattern.compile(regex,Pattern.CASE_INSENSITIVE);
    }

    public boolean validEmail(String email){
        matcher = pattern.matcher(email);
        return  matcher.matches();
    }

}
