package com.A.training.B.C.sinitsynv;

import java.util.Scanner;

public class TaskCh04N036 {
    public static void main(String[] args) {
        System.out.println("Please input number minutes");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int minutes = scanner.nextInt();
        scanner.close();
        System.out.println(isColor(minutes));
    }

    public static String isColor(int t) {
        return t % 5 >= 3 ? "red" : "green";
    }
}

