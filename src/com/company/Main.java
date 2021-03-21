package com.company;

import java.util.Scanner;

import static com.company.ColorStringClass.*;

public class Main {

    public static void main(String[] args) {

        EmailValidator emailValidator = new EmailValidator();
        USPhoneValidation usPhoneValidation = new USPhoneValidation();
        StrongPasswordValidator strongPasswordValidator = new StrongPasswordValidator();
        Scanner scanner = new Scanner(System.in);

        System.out.println(ANSI_RED+"=====> Simple Email-Password Validator by thisisvd <=====");

        boolean flag = true;

        while (flag) {
            System.out.print(ANSI_YELLOW+"Press : \n" +
                    "\t1 -> Email Validator\n" +
                    "\t2 -> Strong Password Validator\n" +
                    "\t3 -> US Phone Number Validator\n" +
                    "\tType 'quit' -> To quit the application\n" +
                    "Your Response : ");

            String response = scanner.nextLine();

            if (response.toLowerCase().equals("quit")) {
                System.out.println(ANSI_RED+"***** Thank you for your time *****");
                flag = false;
                continue;
            }

            boolean isNotEmpty = true;
            switch (response) {
                case "1":
                    aa:
                    while (true) {
                        System.out.println(ANSI_BLUE+"Type 'back' for selecting options!");
                        System.out.print(ANSI_BLUE + "Enter email to check its validity : ");
                        String email = scanner.nextLine();

                        if(email.toLowerCase().equals("back")){
                            break;
                        }

                        if (!email.isEmpty()) {
                            if (emailValidator.validEmail(email)) {
                                System.out.println(ANSI_WHITE + "=====> Email : " + email + " is valid.");
                            } else {
                                System.out.println(ANSI_WHITE + "=====> Email : " + email + " is invalid.");
                            }
                        } else {
                            System.out.println(ANSI_RED + "*Please enter an email.");
                        }
                    }
                    break ;
                case "2":
                    aa:
                    while (true) {
                        System.out.println(ANSI_CYAN+"Type 'back' for selecting options!");
                        System.out.print(ANSI_CYAN + "Enter password to check its validity : ");
                        String password = scanner.nextLine();

                        if(password.toLowerCase().equals("back")){
                            break;
                        }

                        if (!password.isEmpty()) {
                            if (strongPasswordValidator.validPassword(password)) {
                                System.out.println(ANSI_WHITE + "=====> Password : " + password + " is strong.");
                            } else {
                                System.out.println(ANSI_WHITE + "=====> Password : " + password + " is week.");
                            }
                        } else {
                            System.out.println(ANSI_RED + "*Please enter a password.");
                        }
                    }
                    break;
                case "3":
                    aa:
                    while (true) {
                        System.out.println(ANSI_PURPLE+"Type 'back' for selecting options!");
                        System.out.print(ANSI_PURPLE + "Enter US phone number to check its validity : ");
                        String phone = scanner.nextLine();

                        if(phone.toLowerCase().equals("back")){
                            break;
                        }

                        if (!phone.isEmpty()) {
                            if (usPhoneValidation.validUSPhone(phone)) {
                                System.out.println(ANSI_WHITE + "=====> Phone Number : " + phone + " is valid.");
                            } else {
                                System.out.println(ANSI_WHITE + "=====> Phone Number : " + phone + " is invalid.");
                            }
                        } else {
                            System.out.println(ANSI_RED + "*Please enter a US phone number.");
                        }
                    }
                    break;
                default:
                    System.out.println(ANSI_RED+"Please enter valid options!");
            }

        }

    }
}
