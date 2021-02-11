package com.company;

public class Main {
    private static final int SIZE = 10;
    private static String[][] wow = new String[SIZE][SIZE];
    private static final String s = "coolguy";
    static Double newValue = 10.5123;

    public static void main(String[] args) {
        makeSmiley();

    }

    private static void symmetryAroundCenter() {

        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (Math.pow(i, 2) + Math.pow(j, 2) < Math.pow(SIZE, 1.25) || i == SIZE-1 || j == SIZE-1) {
                    wow[i][j] = s;
                } else {
                    wow[i][j] = " ".repeat(s.length());
                }
            }
        }
        printTop();
        printBottom();
    }

    private static void makeSmiley() {
        makeTopPart(true, false);
        printTop();
        makeCircularPart(1.75, 1.5, false);
        printBottom();
    }

    private static void makeTopPart(boolean hair, boolean frame) {
        double widthWeight = 10;
        double heightWeight = 1;
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                double width = heightWeight * Math.pow(j, 2);
                double height = widthWeight * Math.pow(i, 2);
                if (i <= SIZE / 2 && j <= SIZE / 2 && j >= SIZE / 3 && i >= SIZE / 3) {
                    wow[i][j] = s;
                } else if (hair && height + width > 4 * Math.pow(SIZE, 2) && height + width < 7 * Math.pow(SIZE, 2)) {
                    wow[i][j] = s;
                } else if (frame && i == SIZE - 1 || frame && j == SIZE - 1) {
                    wow[i][j] = s;
                } else {
                    wow[i][j] = " ".repeat(s.length());
                }
            }
        }
    }

    private static void makeCircularPart(double outerBound, double innerBound, boolean frame) {
        double widthWeight = 5;
        double heightWeight = 1;
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                double width = heightWeight * Math.pow(j, 2);
                double height = widthWeight * Math.pow(i, 2);
                if (width + height < Math.pow(SIZE, outerBound) && height + width > Math.pow(SIZE, innerBound)) {
                    wow[i][j] = s;
                } else if (frame && i == SIZE - 1 || frame && j == SIZE - 1) {
                    wow[i][j] = s;
                } else {
                    wow[i][j] = " ".repeat(s.length());
                }
            }
        }
    }

    private static void printTop() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                System.out.print(wow[SIZE - 1 - i][SIZE - 1 - j]);
            }
            for (int j = 0; j < SIZE; j++) {
                System.out.print(wow[SIZE - 1 - i][j]);
            }
            System.out.println();
        }
    }

    private static void printBottom() {
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
