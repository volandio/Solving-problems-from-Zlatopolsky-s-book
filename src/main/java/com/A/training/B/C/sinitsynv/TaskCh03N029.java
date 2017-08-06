package com.A.training.B.C.sinitsynv;

import java.util.Scanner;

public class TaskCh03N029 {
    public static void main(String[] args) {
        System.out.println("Please input three numbers, each on a new line");
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int z = scanner.nextInt();
        scanner.close();
        System.out.println(isOddTwoNumbers(x, y));
        System.out.println(isOneOfTwoNumbersLessTwenty(x, y));
        System.out.println(isOneOrTwoOfTwoNumbersEqualZero(x, y));
        System.out.println(isThreeNumbersNegative(x, y, z));
        System.out.println(isOnlyOneOfThreeNumbersMultipleFive(x, y, z));
        System.out.println(isOneOrMoreOfThreeNumbersMoreHundred(x, y, z));
    }

    /**
     * Check x and y are odd
     */
    public static boolean isOddTwoNumbers(int x, int y) {
        return x % 2 != 0 && y % 2 != 0;
    }

    /**
     * Check only x or y less 20
     */
    public static boolean isOneOfTwoNumbersLessTwenty(int x, int y) {
        return x < 20 ^ y < 20;
    }

    /**
     * Check x or y or x and y are equal zero
     */
    public static boolean isOneOrTwoOfTwoNumbersEqualZero(int x, int y) {
        return x == 0 || y == 0;
    }

    /**
     * Check x and y and z are negative
     */
    public static boolean isThreeNumbersNegative(int x, int y, int z) {
        return x < 0 && y < 0 && z < 0;
    }

    /**
     * Check only one of x,y,z is multiple 5
     */
    public static boolean isOnlyOneOfThreeNumbersMultipleFive(int x, int y, int z) {
        boolean a = x % 5 == 0;
        boolean b = y % 5 == 0;
        boolean c = z % 5 == 0;
        return a && !b && !c || !a && b && !c || !a && !b && c;
    }

    /**
     * Check one number or more of three are more 100
     */
    public static boolean isOneOrMoreOfThreeNumbersMoreHundred(int x, int y, int z) {
        return x > 100 || y > 100 || z > 100;
    }
}
