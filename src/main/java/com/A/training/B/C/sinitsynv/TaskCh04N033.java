package com.A.training.B.C.sinitsynv;

import java.util.Scanner;

public class TaskCh04N033 {
    public static void main(String[] args) {
        System.out.println("Please input number");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        scanner.close();
        System.out.println(isLastNumberEven(number));
        System.out.println(isLastNumberOdd(number));
    }

    public static boolean isLastNumberEven(int x) {
        return x % 2 == 0;
    }

    public static boolean isLastNumberOdd(int x) {
        return !isLastNumberEven(x);
    }
}
