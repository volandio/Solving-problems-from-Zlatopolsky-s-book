package com.A.training.B.C.sinitsynv;

import java.util.Scanner;

public class TaskCh12N063 {
    public static void main(String[] args) {
        int[][] array = new int[11][4];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0, school = i + 1; i < array.length; i++, school++) {
            for (int j = 0, classes = j + 1; j < array[0].length; j++, classes++) {
                System.out.println("Please input number students in school "
                    + school + " in parallel of classes " + classes);
                array[i][j] = scanner.nextInt();
            }
        }
        scanner.close();
        for (int a : calculateAverageNumberStudents(array)) {
            System.out.print(a + " ");
        }
    }

    public static int[] calculateAverageNumberStudents(int[][] array) {
        int[] averageNumberStudents = new int[array[0].length];
        for (int j = 0; j < array[0].length; j++) {
            for (int[] anArray : array) {
                averageNumberStudents[j] += anArray[j];
            }
            averageNumberStudents[j] /= array.length;
        }
        return averageNumberStudents;
    }
}

