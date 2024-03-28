package org.learning.snack03;

public class Snack03 {

    public static int randInt(int min, int max) {
        return Math.round((float) (Math.random() * (max - min) + min));
    }

    public static void main(String[] args) {
        int[] numbers = new int[20];
        int totalAtOddIndex = 0;

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = randInt(1, 100);
            if (i % 2 != 0) {
                totalAtOddIndex += numbers[i];
            }
        }


        for (int number : numbers) System.out.println(number);
        System.out.println("Total of numbers with an odd index: " + totalAtOddIndex);
    }
}
