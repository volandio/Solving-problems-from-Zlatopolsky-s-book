package com.A.training.B.C.sinitsynv;

import java.util.Scanner;

public class TaskCh10N047 {
    public static void main(String[] args) {
        System.out.println("Please input number");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        scanner.close();
        System.out.println(getFibonacci(7));
    }

    public static int getFibonacci(int number) {
        if (number == 0) {
            return 0;
        } else if (number < 3) {
            return 1;
        } else {
            return getFibonacci(number - 1) + getFibonacci(number - 2);
        }
    }
}


