package com.bridgelabz.userregistration;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class UserRegistration
{
    //UC-1Method to validate first name
    public static boolean validateFirstName(String firstName)
    {
        return firstName.matches("^[A-Z][a-zA-Z]{2,}$");
    }

    //UC-2 Method to validate second name
    public static boolean validateSecondName(String secondName)
    {
        return secondName.matches("^[A-Z][a-zA-Z]{2,}$");
    }

    //UC-3 Method to validate email
    public static  boolean validateEmail(String email)
    {
        return  email.matches("^[a-zA-Z0-9]+([._+-]+[a-zA-Z0-9])?@[a-zA-Z0-9]+[a-zA-Z0-9]+\\.[a-z]{2,4}(\\.[a-z]{2,})?$");
      //return email.matches("^[a-zA-Z0-9]+([._+-][a-zA-Z0-9]+)?@[a-zA-Z0-9]+\\.[a-zA-Z]{2,}(\\.[a-zA-Z]{2,})?$");
        //return email.matches("^[a-zA-Z0-9]+([._%+-]?[a-zA-Z0-9]+)*@[a-zA-Z0-9]+(\\.[a-zA-Z]{2,})+$");
    }

    //UC-4 Method to validate mobile number
    public static boolean validateMobileNumber(String mobileNumber)
    {
        return mobileNumber.matches("^[0-9]{2,}\\s[0-9]{10}");
    }

    //UC-5 Method to validate password as per Rule-1
    public static boolean validateRuleOne(String passwordRuleOne)
    {
        return passwordRuleOne.matches("^[^\\s]{8,}");
    }

    //UC-6 Method to validate password as per Rule-2
    public static boolean validateRuleTwo(String passwordRuleTwo)
    {
        return passwordRuleTwo.matches("^(?=.*[A-Z])[^\\s]{8,}$");
    }

    //UC-7 Method to validate password as per Rule-3
    public static boolean validateRuleThree(String passwordRuleThree)
    {
        return passwordRuleThree.matches("(?=.*[0-9])(?=.*[A-Z])[^\\s]{8,}$");
    }

    //UC-8 Method to validate password as per Rule-4
    private static boolean validateRuleFour(String passwordRuleFour)
    {
        return passwordRuleFour.matches("^(?=.*[A-Z])(?=.*[0-9])(?=^[^\\W_\\s]*[\\W_][^\\W_\\s]*$)\\S{8,}$");
    }

    // UC-9: Reusable method to validate emails (same as UC-3, could be improved by avoiding duplication)
    // Set to store previously validated (unique) email addresses
    private static final Set<String> emailSet = new HashSet<>();
    public static boolean validEmail(String email)
    {
        String emailRegex= ("^[a-zA-Z0-9]+([._+-]+[a-zA-Z0-9])?@[a-zA-Z0-9]+[a-zA-Z0-9]+\\.[a-z]{2,4}(\\.[a-z]{2,})?$");
        // Normalize to lowercase to avoid case-sensitive duplicates
        email = email.toLowerCase();

        // Check format and duplication
        if (email.matches(emailRegex) && !emailSet.contains(email)) {
            emailSet.add(email); // Store the email as validated
            return true;
        }

        return false; // Invalid format or duplicate
    }

    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
//        System.out.println("Enter First Name");
//        String firstName=scanner.nextLine();
//        System.out.println("First name having First character Upper and having minium 3 character "+validateFirstName(firstName));

//        System.out.println("Enter Second Name");
//        String secondName=scanner.nextLine();
//        System.out.println("Second name having First character Upper and having minium 3 character "+validateSecondName(secondName));

//        System.out.println("Enter email");
//        String email=scanner.nextLine();
//        System.out.println("Email validate "+validateEmail(email));

//        System.out.println("Enter mobile number");
//        String mobileNUmber=scanner.nextLine();
//        System.out.println("Email validate "+validateMobileNumber(mobileNUmber));


//        System.out.println("Enter password");
//        String passwordRuleOne=scanner.nextLine();
//        System.out.println("Email validate "+validateRuleOne(passwordRuleOne));

//        System.out.println("Enter password");
//        String passwordRuleTwo=scanner.nextLine();
//        System.out.println("Email validate "+validateRuleTwo(passwordRuleTwo));

//        System.out.println("Enter password");
//        String passwordRuleThree=scanner.nextLine();
//        System.out.println("Email validate "+validateRuleThree(passwordRuleThree));

        System.out.println("Enter password");
        String passwordRuleFour=scanner.nextLine();
        System.out.println("Email validate "+validateRuleFour(passwordRuleFour));

         // Final email input to test sample validation again (UC-9)
        String[] testEmails = {"abc@yahoo.com","abc-100@yahoo.com","abc.100@yahoo.com","abc111@abc.com","abc-100@abc.net",
                                "abc.100@abc.com.au","abc@1.com","abc@gmail.com.com","abc+100@gmail.com"};

        for (String email : testEmails) {
            boolean isValid = validEmail(email);
            System.out.println(email + " => " + (isValid ? "Valid & Added" : "Invalid or Duplicate"));
        }


    }




}
