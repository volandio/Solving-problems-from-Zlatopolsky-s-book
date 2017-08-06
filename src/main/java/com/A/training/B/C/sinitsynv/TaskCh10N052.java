package com.A.training.B.C.sinitsynv;

import java.util.Scanner;

public class TaskCh10N052 {
    public static void main(String[] args) {
        System.out.println("Please input number");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        scanner.close();
        System.out.println(getReverseNaturalNumber(number));
    }

    public static int getReverseNaturalNumber(int number) {
        if (number > 10) {
            return Integer.parseInt(String.valueOf(number % 10) + getReverseNaturalNumber(number / 10));
        }
        return number;
    }
}

