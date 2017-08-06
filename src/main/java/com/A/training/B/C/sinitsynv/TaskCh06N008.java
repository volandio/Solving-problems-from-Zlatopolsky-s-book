package com.A.training.B.C.sinitsynv;

import java.util.Scanner;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class TaskCh06N008 {
    public static void main(String[] args) {
        System.out.println("Please input number");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        scanner.close();
        for (int i : getListNumbersSquare(number)) {
            System.out.print(i + " ");
        }
    }

    public static int[] getListNumbersSquare(int n) {
        int[] list = new int[(int) sqrt(n)];
        for (int i = 0; i < list.length; i++) {
            list[i] = (int) pow(i + 1, 2);
        }
        return list;
    }
}
