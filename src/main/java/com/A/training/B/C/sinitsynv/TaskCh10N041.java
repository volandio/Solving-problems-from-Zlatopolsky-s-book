package com.A.training.B.C.sinitsynv;

import java.util.Scanner;

public class TaskCh10N041 {
    public static void main(String[] args) {
        System.out.println("Please input number");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        scanner.close();
        System.out.println(getFactorial(number));
    }

    public static int getFactorial(int number) {
        if (number == 1) {
            return 1;
        }
        return number * getFactorial(number - 1);
    }
}
