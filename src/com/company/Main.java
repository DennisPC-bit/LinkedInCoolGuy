package com.company;

public class Main {
    private static final int SIZE = 5;

    public static void main(String[] args) {
        String[][] wow = new String[SIZE][SIZE];
        String s = "Wow what a cool guy ";

        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (Math.pow(i, 2) + Math.pow(j, 2) < Math.pow(SIZE, 1.25) || i == 4 || j == 4) {
                    wow[i][j] = s;
                } else {
                    wow[i][j] = " ".repeat(s.length());
                }
            }
        }
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                System.out.print(wow[SIZE - 1 - i][SIZE - 1 - j]);
            }
            for (int j = 0; j < SIZE; j++) {
                System.out.print(wow[SIZE - 1 - i][j]);
            }
            System.out.println();
        }
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                System.out.print(wow[i][SIZE - 1 - j]);
            }
            for (int j = 0; j < SIZE; j++) {
                System.out.print(wow[i][j]);
            }
            System.out.println();
        }

    }
}
