package com.A.training.B.C.sinitsynv;

import java.util.Scanner;

public class TaskCh10N056 {
    public static void main(String[] args) {
        System.out.println("Please input number");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        scanner.close();
        System.out.println(isSimpleNumber(number));
    }

    public static boolean isSimpleNumber(int number) {
        int divisor = 2;
        return isSimpleNumber(number, divisor);
    }

    public static boolean isSimpleNumber(int number, int divisor) {
        if (divisor > number / 2) {
            return true;
        }
        if (number < 2 || number % divisor == 0) {
            return false;
        }
        return isSimpleNumber(number, ++divisor);
    }
}