package com.A.training.B.C.sinitsynv;

import java.util.Scanner;

public class TaskCh10N050 {
    public static void main(String[] args) {
        System.out.println("Please input two numbers, each on new line:");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        scanner.close();
        System.out.println(getAkkermanNumber(n, m));
    }

    public static int getAkkermanNumber(int n, int m) {
        if (n == 0) {
            return m + 1;
        } else if (n > 0 && m == 0) {
            return getAkkermanNumber(n - 1, 1);
        } else {
            return getAkkermanNumber(n - 1, getAkkermanNumber(n, m - 1));
        }
    }
}


