package com.A.training.B.C.sinitsynv;

import java.util.Scanner;

public class TaskCh09N185 {
    public static void main(String[] args) {
        System.out.println("Please input arithmetic expression with brackets:");
        Scanner scanner = new Scanner(System.in);
        String exampleMath = scanner.next();
        scanner.close();
        System.out.println(isBracketsCorrectly(exampleMath));
    }

    public static String isBracketsCorrectly(String exampleMath) {
        char[] array = exampleMath.toCharArray();
        int leftBrackets = 0;
        int rightBrackets = 0;
        for (char x : array) {
            if (x == '(') {
                leftBrackets++;
            } else if (x == ')') {
                rightBrackets++;
            }
        }
        String result = "";
        if (leftBrackets == rightBrackets) {
            result = "Yes";
        } else {
            int difference = leftBrackets - rightBrackets;
            if (difference > 0) {
                result = "No, \"(\" all redundant = " + difference;
            } else {
                int index = 0;
                for (int i = 0; i < array.length; i++) {
                    if (array[i] == ')') {
                        index++;
                        if (index > leftBrackets) {
                            result = "No, \")\" first redundant = " + i;
                        }
                    }
                }
            }
        }
        return result;
    }
}

