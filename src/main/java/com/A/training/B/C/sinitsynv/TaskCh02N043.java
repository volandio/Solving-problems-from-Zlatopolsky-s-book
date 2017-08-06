package com.A.training.B.C.sinitsynv;

import java.util.Scanner;

public class TaskCh02N043 {
    public static void main(String[] args) {
        System.out.println("Please input number a and number b, each on a new line");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        scanner.close();
        System.out.println(getNumberOneOrAny(a, b));
    }

    public static int getNumberOneOrAny(int a, int b) {
        return (a % b) * (b % a) + 1;
    }
}

