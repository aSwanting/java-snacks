package org.learning.snack01;

import java.util.Scanner;

public class Snack01 {
    public static void main(String[] args) {

        int userNumber;
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter number between 10 and 20");
        userNumber = Integer.parseInt(scan.nextLine());

        while (userNumber < 10 || userNumber > 20) {
            System.out.println("NO! Enter number between 10 and 20");
            userNumber = Integer.parseInt(scan.nextLine());
        }

        System.out.println("You entered " + userNumber + ". Great Choice!");
        scan.close();

    }
}
