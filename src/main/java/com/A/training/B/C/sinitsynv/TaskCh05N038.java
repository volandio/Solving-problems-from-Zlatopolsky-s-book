package com.A.training.B.C.sinitsynv;

import java.util.Scanner;

public class TaskCh05N038 {
    public static void main(String[] args) {
        System.out.println("Please input number stage");
        Scanner scanner = new Scanner(System.in);
        int stage = scanner.nextInt();
        scanner.close();
        System.out.println(getAllDistance(stage));
        System.out.println(getDistanceFromHome(stage));
    }

    public static double getAllDistance(int x) {
        double distanceAll = 0;
        for (int i = 1; i <= x; i++) {
            distanceAll += 1 / (double) i;
        }
        return distanceAll;
    }

    public static double getDistanceFromHome(int x) {
        double distanceFromHome = 0;
        for (int i = 1; i <= x; i += 2) {
            distanceFromHome += 1 / (double) i;
        }
        for (int i = 2; i <= x; i += 2) {
            distanceFromHome -= 1 / (double) i;
        }
        return distanceFromHome;
    }
}
