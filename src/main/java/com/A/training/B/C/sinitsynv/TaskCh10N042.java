package com.A.training.B.C.sinitsynv;

import java.util.Scanner;

public class TaskCh10N042 {
    public static void main(String[] args) {
        System.out.println("Please input number and degree, each on new line:");
        Scanner scanner = new Scanner(System.in);
        double number = scanner.nextDouble();
        int degree = scanner.nextInt();
        scanner.close();
        System.out.println(powOfNumber(number, degree));
    }

    public static double powOfNumber(double number, int degree) {
        if (degree == 0) {
            return 1;
        }
        return number * powOfNumber(number, degree - 1);
    }
}
