package org.learning.snack06;

import java.util.Scanner;

public class Snack06 {
    public static void main(String[] args) {

        int seconds, minutes, hours;

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number in seconds to have it converted to HH:MM:SS");
        seconds = Integer.parseInt(scan.nextLine());
        scan.close();

        minutes = seconds / 60;
        hours = minutes / 60;

        if (minutes > 0) {
            seconds = seconds - 60 * minutes;
        }

        if (hours > 0) {
            minutes = minutes - 60 * hours;
        }

        String formattedTotalTime = String.format("%02d:%02d:%02d", hours, minutes, seconds);


        System.out.println(formattedTotalTime);

    }
}
