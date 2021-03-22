package com.company;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexFinder {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        boolean validity = true;

        while (validity){
            System.out.println("To Quit enter : quit");
            System.out.println("Enter Text : ");
            String text = scanner.nextLine();

            if(text.toLowerCase().equals("quit")){
                validity = false;
                continue;
            }

            System.out.println("Enter Regex Pattern : ");
            String regex = scanner.nextLine();

            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(text);

            boolean found = false;

            while (matcher.find()){
                System.out.println("Founded "+matcher.group()+" starting at index "+matcher.start()+
                        " and ending at index "+matcher.end()+".");
                found = true;
            }

            if (!found){
                System.out.println("Text not founded!.");
            }

        }

    }

}
