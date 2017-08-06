package com.A.training.B.C.sinitsynv;

import java.util.Scanner;

public class TaskCh01N003 {
    public static void main(String[] args) {
        System.out.println("Enter one number");
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        System.out.println("You are enter number " + number);
        in.close();
    }
}
