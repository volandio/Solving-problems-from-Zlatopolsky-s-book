package com.A.training.B.C.sinitsynv;

import java.util.Scanner;

public class TaskCh10N043 {
    public static void main(String[] args) {
        System.out.println("Please input number");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        scanner.close();
        System.out.println(getSumOfNumerals(number));
        System.out.println(getAmountOfNumerals(number));
    }

    public static int getSumOfNumerals(int number) {
        if (number == 0) {
            return 0;
        }
        return number % 10 + getSumOfNumerals(number / 10);
    }

    public static int getAmountOfNumerals(int number) {
        if (number == 0) {
            return 0;
        }
        return getAmountOfNumerals(number / 10) + 1;
    }
}
