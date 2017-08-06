package com.A.training.B.C.sinitsynv;

import java.util.Scanner;

public class TaskCh10N051 {
    public static void main(String[] args) {
        System.out.println("Please input number");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();
        procedureA(n);
        System.out.println();
        procedureB(n);
        System.out.println();
        procedureC(n);
    }

    public static void procedureA(int n) {
        if (n > 0) {
            System.out.print(n);
            procedureA(n - 1);
        }
    }

    public static void procedureB(int n) {
        if (n > 0) {
            procedureB(n - 1);
            System.out.print(n);
        }
    }

    public static void procedureC(int n) {
        if (n > 0) {
            System.out.print(n);
            procedureC(n - 1);
            System.out.print(n);
        }
    }
}
