package com.A.training.B.C.sinitsynv;

import java.util.Scanner;

public class TaskCh10N044 {
    public static void main(String[] args) {
        System.out.println("Please input number");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        scanner.close();
        System.out.println(getNumeralRoot(number));
    }

    public static int getNumeralRoot(int number) {
        if (number < 10) {
            return number;
        }
        return getNumeralRoot(number % 10 + getNumeralRoot(number / 10));
    }
}
