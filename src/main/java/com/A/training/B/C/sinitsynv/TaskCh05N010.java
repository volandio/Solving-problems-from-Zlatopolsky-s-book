package com.A.training.B.C.sinitsynv;

import java.util.Scanner;

public class TaskCh05N010 {
    public static void main(String[] args) {
        System.out.println("Enter course:");
        Scanner scanner = new Scanner(System.in);
        double course = scanner.nextDouble();
        scanner.close();
        int count = 0;
        for (double i : getCourse(course)) {
            System.out.println(++count + " " + i);
        }
    }

    public static double[] getCourse(double x) {
        double[] rubInDollars = new double[20];
        for (int i = 1; i <= rubInDollars.length; i++) {
            rubInDollars[i - 1] = i * x;
        }
        return rubInDollars;
    }
}
