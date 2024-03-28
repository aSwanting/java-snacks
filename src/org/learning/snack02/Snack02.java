package org.learning.snack02;

public class Snack02 {

    public static int randInt(int min, int max) {
        return Math.round((float) (Math.random() * (max - min) + min));
    }

    public static void main(String[] args) {

        String[] fakeList = new String[20];

        for (int i = 0; i < fakeList.length; i++) {
            String fullName = "";

            for (int j = 0; j < 2; j++) {
                String name = "";

                for (int k = 0; k < randInt(3, 12); k++) {
                    char c = (char) (randInt(0, 25) + 'a');
                    if (k == 0) c = Character.toUpperCase(c);
                    name += c;
                }

                fullName += name + " ";
            }

            fakeList[i] = fullName;

        }

        for (String guest : fakeList) System.out.println(guest);
    }
}
