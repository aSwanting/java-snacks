package org.learning.snack05;

import java.util.Scanner;

public class Snack05 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a string");
        String userInput = scan.nextLine();
        scan.close();

        int letterCount = 0;
        int digitCount = 0;
        int symbolCount = 0;

        for (int i = 0; i < userInput.length(); i++) {

            char currentChar = userInput.charAt(i);
            boolean isLetter = false;
            boolean isDigit = false;

            if (Character.isAlphabetic(currentChar)) isLetter = true;
            if (Character.isDigit(currentChar)) isDigit = true;

            if (isLetter) {
                System.out.println(currentChar + " is a letter");
                letterCount++;
            }

            if (isDigit) {
                System.out.println(currentChar + " is a number");
                digitCount++;
            }

            if (!isDigit && !isLetter) {
                System.out.println(currentChar + " is a symbol");
                symbolCount++;
            }

        }

        System.out.println(userInput + " contains "
                + letterCount + " letter(s), "
                + digitCount + " number(s), and "
                + symbolCount + " symbol(s)");
    }
}
