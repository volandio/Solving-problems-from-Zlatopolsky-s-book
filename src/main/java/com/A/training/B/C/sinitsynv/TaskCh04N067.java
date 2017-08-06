package com.A.training.B.C.sinitsynv;

import java.util.Scanner;

public class TaskCh04N067 {
    public static void main(String[] args) {
        System.out.println("Please input day 1-365");
        Scanner scanner = new Scanner(System.in);
        int day = scanner.nextInt();
        scanner.close();
        System.out.println(isGetDay(day));
    }

    public static String isGetDay(int k) {
        if (k < 1 || k > 365) {
            System.out.println("You input incorrect day");
            return "Incorrect day";
        }
        int x = k % 7;
        return x == 6 || x == 0 ? "Weekend" : "Workday";
    }
}


