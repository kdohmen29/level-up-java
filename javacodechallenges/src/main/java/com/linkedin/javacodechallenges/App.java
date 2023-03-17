package com.linkedin.javacodechallenges;

import java.util.Scanner;

public class App {

    public static boolean isPasswordComplex(String password) {
        int numCheck = 0;
        int upperCheck = 0;
        int lowerCheck = 0;
        if (password.length() >= 6) {
            for (int i = 0; i < password.length(); i++) {
                if (Character.isDigit(password.charAt(i)))
                    numCheck++;
                if (Character.isUpperCase(password.charAt(i)))
                    upperCheck++;
                if (Character.isLowerCase(password.charAt(i))) 
                    lowerCheck++;
                if(lowerCheck>0 && upperCheck>0 && numCheck>0)
                    return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a password: ");
        String userInput = scanner.nextLine();
        System.out.println("Is the password complex? "
                + isPasswordComplex(userInput));

        scanner.close();
    }


}
