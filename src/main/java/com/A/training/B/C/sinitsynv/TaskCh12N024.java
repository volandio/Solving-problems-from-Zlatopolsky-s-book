package com.A.training.B.C.sinitsynv;

import java.util.Arrays;
import java.util.Scanner;

public class TaskCh12N024 {
    public static void main(String[] args) {
        System.out.println("Please input size array:");
        Scanner scanner = new Scanner(System.in);
        int arraySize = scanner.nextInt();
        scanner.close();
        for (int[] i : fillArrayA(arraySize)) {
            System.out.println(Arrays.toString(i));
        }
        System.out.println();
        for (int[] i : fillArrayB(arraySize)) {
            System.out.println(Arrays.toString(i));
        }
    }

    public static int[][] fillArrayA(int arraySize) {
        int[][] array = new int[arraySize][arraySize];
        for (int i = 0; i < arraySize; i++) {
            for (int j = 0; j < arraySize; j++) {
                if (i == 0 || j == 0) {
                    array[i][j] = 1;
                } else {
                    array[i][j] = array[i][j - 1] + array[i - 1][j];
                }
            }
        }
        return array;
    }

    public static int[][] fillArrayB(int arraySize) {
        int[][] array = new int[arraySize][arraySize];
        for (int i = 0; i < arraySize; i++) {
            for (int count = i + 1, j = 0; j < arraySize; count++, j++) {
                if (count > arraySize) {
                    count = 1;
                }
                array[i][j] = count;
            }
        }
        return array;
    }
}
