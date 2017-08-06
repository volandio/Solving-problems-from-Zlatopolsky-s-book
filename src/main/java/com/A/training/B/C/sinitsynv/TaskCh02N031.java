package com.A.training.B.C.sinitsynv;

import java.util.Scanner;

public class TaskCh02N031 {
    public static void main(String[] args) {
        System.out.println("Enter the number (100<=n<=999):");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        scanner.close();
        System.out.println(getEditNumber(number));
    }

    public static int getEditNumber(int n) {
        if (n > 999 || n < 100) {
            System.out.println("You input wrong number");
            return 0;
        }
        return n / 100 * 100 + n % 10 * 10 + n % 100 / 10;
    }
}
