package com.company;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class USPhoneValidation {

    private static String regex = "^([\\(]{1}[0-9]{3}[\\)]{1}[ ]{1}[0-9]{3}[\\-]{1}[0-9]{4})$";
    private Pattern pattern;
    private Matcher matcher;

    public USPhoneValidation() {
        pattern = Pattern.compile(regex,Pattern.CASE_INSENSITIVE);
    }

    public boolean validUSPhone(String email){
        matcher = pattern.matcher(email);
        return  matcher.matches();
    }

}
