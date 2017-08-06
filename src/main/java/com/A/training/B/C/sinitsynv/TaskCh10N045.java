package com.A.training.B.C.sinitsynv;

import java.util.Scanner;

public class TaskCh10N045 {
    public static void main(String[] args) {
        System.out.println("Please input number, step and index, each on new line:");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int step = scanner.nextInt();
        int index = scanner.nextInt();
        scanner.close();
        System.out.println(getProgressionMember(number, step, index));
        System.out.println(getSumFirstMembers(number, step, index));
    }

    public static int getProgressionMember(int number, int step, int index) {
        if (index == 1) {
            return number;
        }
        return step + getProgressionMember(number, step, index - 1);
    }

    public static int getSumFirstMembers(int number, int step, int index) {
        if (index == 0) {
            return 0;
        }
        return number + getSumFirstMembers(number + step, step, index - 1);
    }
}