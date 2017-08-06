package com.A.training.B.C.sinitsynv;

import java.util.Scanner;

public class TaskCh04N015 {
    public static void main(String[] args) {
        System.out.println("Please input numbers year and month birth, year and month today, each on a new line");
        Scanner scanner = new Scanner(System.in);
        int yearBirth = scanner.nextInt();
        int monthBirth = scanner.nextInt();
        int yearToday = scanner.nextInt();
        int monthToday = scanner.nextInt();
        scanner.close();
        System.out.println(getAge(yearBirth, monthBirth, yearToday, monthToday));
    }

    public static int getAge(int yearBirth, int monthBirth, int yearToday, int monthToday) {
        if (monthBirth > 12 || monthBirth < 1 || monthToday > 12 || monthToday < 1) {
            System.out.println("You input incorrect date");
            return 0;
        }
        int difference = yearToday - yearBirth;
        return monthToday < monthBirth ? difference - 1 : difference;
    }
}
