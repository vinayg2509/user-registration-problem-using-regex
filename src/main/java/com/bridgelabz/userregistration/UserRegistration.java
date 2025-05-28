package com.bridgelabz.userregistration;

import java.util.Scanner;

public class UserRegistration
{
    //Method to validate first name
    public static boolean validateFirstName(String firstName)
    {
        return firstName.matches("^[A-Z][a-zA-Z]{2,}$");
    }

    //Method to validate second name
    public static boolean validateSecondName(String secondName)
    {
        return secondName.matches("^[A-Z][a-zA-Z]{2,}$");
    }

    //Method to validate email
    public static  boolean validateEmail(String email)
    {
        return  email.matches("^[a-zA-Z0-9]+([._+-]+[a-zA-Z0-9])?@[a-zA-Z0-9]+[a-zA-Z0-9]+\\.[a-z]{2,4}(\\.[a-z]{2,})?$");
      //return email.matches("^[a-zA-Z0-9]+([._+-][a-zA-Z0-9]+)?@[a-zA-Z0-9]+\\.[a-zA-Z]{2,}(\\.[a-zA-Z]{2,})?$");
        //return email.matches("^[a-zA-Z0-9]+([._%+-]?[a-zA-Z0-9]+)*@[a-zA-Z0-9]+(\\.[a-zA-Z]{2,})+$");
    }

    //Method to validate mobile number
    public static boolean validateMobileNumber(String mobileNumber)
    {
        return mobileNumber.matches("^[0-9]{2,}\\s[0-9]{10}");
    }

    //Method to validate password as per Rule-1
    public static boolean validateRuleOne(String passwordRuleOne)
    {
        return passwordRuleOne.matches("^[^\\s]{8,}");
    }

    //Method to validate password as per Rule-2
    public static boolean validateRuleTwo(String passwordRuleTwo)
    {
        return passwordRuleTwo.matches("^(?=.*[A-Z])[^\\s]{8,}$");
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

        System.out.println("Enter password");
        String passwordRuleTwo=scanner.nextLine();
        System.out.println("Email validate "+validateRuleTwo(passwordRuleTwo));


    }




}
