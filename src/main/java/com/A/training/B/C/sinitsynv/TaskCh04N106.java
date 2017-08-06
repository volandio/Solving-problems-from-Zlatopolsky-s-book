package com.A.training.B.C.sinitsynv;

import java.util.Scanner;

public class TaskCh04N106 {
    public static void main(String[] args) {
        System.out.println("Please input month 1-12");
        Scanner scanner = new Scanner(System.in);
        int month = scanner.nextInt();
        scanner.close();
        System.out.println(getMonthByNumber(month));
    }

    public static String getMonthByNumber(int x) {
        if (x < 1 || x > 12) {
            System.out.println("You input incorrect month");
            return "Incorrect month";
        }
        String month = "";
        switch (x) {
            case 12:
            case 1:
            case 2:
                month = "winter";
                break;
            case 3:
            case 4:
            case 5:
                month = "spring";
                break;
            case 6:
            case 7:
            case 8:
                month = "summer";
                break;
            case 9:
            case 10:
            case 11:
                month = "autumn";
                break;
        }
        return month;
    }
}
