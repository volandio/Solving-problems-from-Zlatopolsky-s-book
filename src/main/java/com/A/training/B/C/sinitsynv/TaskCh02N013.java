package com.A.training.B.C.sinitsynv;

import java.util.Scanner;

public class TaskCh02N013 {
    public static void main(String[] args) {
        System.out.println("Please input number 200 > n > 100");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        scanner.close();
        System.out.println(getReverseNumber(number));
    }

    public static int getReverseNumber(int i) {
        if (i >= 200 || i <= 100) {
            System.out.println("You input wrong number");
            return 0;
        }
        return i % 10 * 100 + i % 100 / 10 * 10 + i / 100;
    }
}

