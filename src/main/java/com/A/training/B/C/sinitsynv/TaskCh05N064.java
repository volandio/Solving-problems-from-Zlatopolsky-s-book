package com.A.training.B.C.sinitsynv;

import java.util.Scanner;

public class TaskCh05N064 {
    public static void main(String[] args) {
        double[][] areaAndPopulation = new double[2][12];
        Scanner scanner = new Scanner(System.in);
        for (int count = 1, j = 0; j < areaAndPopulation[0].length; j++, count++) {
            System.out.println("Please input area of district: " + count + " of 12");
            areaAndPopulation[0][j] = scanner.nextDouble();
        }
        for (int count = 1, j = 0; j < areaAndPopulation[1].length; j++, count++) {
            System.out.println("Please input population of district: " + count + " of 12");
            areaAndPopulation[1][j] = scanner.nextDouble();
        }
        scanner.close();
        System.out.println(getPopulationDensity(areaAndPopulation));
    }

    public static double getPopulationDensity(double[][] areaAndPopulation) {
        double populationDensity = 0;
        for (int i = 0; i < areaAndPopulation[0].length; i++) {
            populationDensity += areaAndPopulation[0][i] / areaAndPopulation[1][i];
        }
        return populationDensity / areaAndPopulation[0].length;
    }
}
