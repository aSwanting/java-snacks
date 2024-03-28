package org.learning.snack04;

import java.util.Scanner;

public class Snack04 {
    public static void main(String[] args) {

        boolean isPalindrome = true;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a word to check if it is a Palindrome!");
        String userInput = scan.nextLine();
        scan.close();

        for (int i = 0; i < userInput.length() / 2; i++) {
            char currentLeft = userInput.toLowerCase().charAt(i);
            char currentRight = userInput.toLowerCase().charAt(userInput.length() - 1 - i);
            System.out.println(currentLeft + " " + currentRight);
            if (currentLeft != currentRight) isPalindrome = false;
        }

        if (isPalindrome) {
            System.out.println(userInput + " is a palindrome!");
        } else {
            System.out.println(userInput + " is NOT a palindrome!");
        }
    }
}
