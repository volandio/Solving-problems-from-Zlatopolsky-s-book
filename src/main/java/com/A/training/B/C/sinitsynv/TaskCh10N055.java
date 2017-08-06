package com.A.training.B.C.sinitsynv;

import java.util.Scanner;

public class TaskCh10N055 {
    public static void main(String[] args) {
        System.out.println("Please enter number:");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        System.out.println("Please enter numeration 2 <= N < = 16.");
        int numeration = scanner.nextInt();
        scanner.close();
        System.out.println(changeNumeration(number, numeration));
    }

    public static String changeNumeration(int number, int numeration) {
        if (numeration < 2 || numeration > 16) {
            return "Incorrect numeration, please enter 2 - 16.";
        }
        StringBuilder str = new StringBuilder();
        char[] symbols = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        return changeNumeration(number, numeration, str, symbols);
    }

    public static String changeNumeration(int number, int numeration, StringBuilder str, char[] symbols) {
        int x = number % numeration;
        str.append(symbols[x]);
        if (x == number) {
            return str.reverse().toString();
        }
        return changeNumeration(number / numeration, numeration, str, symbols);
    }

}

