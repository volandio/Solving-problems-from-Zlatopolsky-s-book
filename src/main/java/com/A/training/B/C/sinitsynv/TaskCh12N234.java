package com.A.training.B.C.sinitsynv;

import java.util.Arrays;
import java.util.Scanner;

public class TaskCh12N234 {
    public static void main(String[] args) {
        System.out.println("Please input count of rows and columns, each on new line:");
        Scanner scanner = new Scanner(System.in);
        int rows = scanner.nextInt();
        int columns = scanner.nextInt();
        int[][] array = new int[rows][columns];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                System.out.println("Please input number");
                array[i][j] = scanner.nextInt();
            }
        }
        System.out.println("Please input number removing row and column");
        int k = scanner.nextInt();
        scanner.close();
        for (int[] a : deleteRow(array, k)) {
            System.out.println(Arrays.toString(a));
        }
        System.out.println();
        for (int[] a : deleteColumn(array, k)) {
            System.out.println(Arrays.toString(a));
        }
    }

    public static int[][] deleteRow(int[][] array, int number) {

        for (int i = number; i < array.length - 1; i++) {
            array[i] = array[i + 1].clone();
        }
        for (int j = 0; j < array.length; j++) {
            array[array.length - 1][j] = 0;
        }
        return array;
    }

    public static int[][] deleteColumn(int[][] array, int number) {
        int lastColumn = array[0].length - 1;
        for (int i = 0; i < array.length; i++) {
            System.arraycopy(array[i], number + 1, array[i], number, lastColumn - number);
            array[i][lastColumn] = 0;
        }
        return array;
    }

}