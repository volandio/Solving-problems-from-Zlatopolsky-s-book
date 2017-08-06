package com.A.training.B.C.sinitsynv;

import java.util.Scanner;

public class TaskCh10N048 {
    public static void main(String[] args) {
        System.out.println("Please input size array:");
        Scanner scanner = new Scanner(System.in);
        int sizeArray = scanner.nextInt();
        int[] array = new int[sizeArray];
        for (int i = 0; i < sizeArray; i++) {
            System.out.println("Please input next number:");
            array[i] = scanner.nextInt();
        }
        scanner.close();
        System.out.println(findMax(array, sizeArray));
    }

    public static int findMax(int[] array, int size) {
        if (size == 0) {
            return array[0];
        }
        return compare(array[size - 1], findMax(array, size - 1));
    }

    private static int compare(int x, int y) {
        return x >= y ? x : y;
    }
}
