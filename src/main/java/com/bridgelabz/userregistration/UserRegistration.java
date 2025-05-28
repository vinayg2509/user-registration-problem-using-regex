package com.bridgelabz.userregistration;

import java.util.Scanner;

public class UserRegistration
{
    public static boolean validateFirstName(String firstName)
    {
        return firstName.matches("^[A-Z][a-zA-Z]{2,}$");
    }
    public static boolean validateSecondName(String secondName)
    {
        return secondName.matches("^[A-Z][a-zA-Z]{2,}$");
    }
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter First Name");
        String firstName=scanner.nextLine();
        System.out.println("Enter Second Name");
        String secondName=scanner.nextLine();

        System.out.println("First name having First character Upper and having minium 3 character "+validateFirstName(firstName));
        System.out.println("Second name having First character Upper and having minium 3 character "+validateSecondName(secondName));

    }


}
