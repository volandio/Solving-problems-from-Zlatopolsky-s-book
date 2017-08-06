package com.A.training.B.C.sinitsynv;

import java.util.Scanner;

public class TaskCh10N046 {
    public static void main(String[] args) {
        System.out.println("Please input number, denominator and index, each on new line:");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int denominator = scanner.nextInt();
        int index = scanner.nextInt();
        scanner.close();
        System.out.println(getProgressionMember(number, denominator, index));
        System.out.println(getSumFirstMembers(number, denominator, index));
    }

    public static int getProgressionMember(int number, int denominator, int index) {
        if (index == 1) {
            return number;
        }
        return getProgressionMember(number * denominator, denominator, index - 1);
    }

    public static int getSumFirstMembers(int number, int denominator, int index) {
        if (index == 0) {
            return 0;
        }
        return number + getSumFirstMembers(number * denominator, denominator, index - 1);
    }
}
