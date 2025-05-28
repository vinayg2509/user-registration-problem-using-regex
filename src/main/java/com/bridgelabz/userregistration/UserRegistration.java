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

    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
//        System.out.println("Enter First Name");
//        String firstName=scanner.nextLine();
//        System.out.println("First name having First character Upper and having minium 3 character "+validateFirstName(firstName));

//        System.out.println("Enter Second Name");
//        String secondName=scanner.nextLine();
//        System.out.println("Second name having First character Upper and having minium 3 character "+validateSecondName(secondName));

        System.out.println("Enter email");
        String email=scanner.nextLine();
        System.out.println("Email validate "+validateEmail(email));


    }


}
