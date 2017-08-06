package com.A.training.B.C.sinitsynv;

import java.util.Arrays;
import java.util.Scanner;

public class TaskCh11N158 {
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
        System.out.println(Arrays.toString(deleteSameElement(array)));
    }

    public static int[] deleteSameElement(int[] array) {
        for (int count = 0, i = 0; i < array.length - count; i++) {
            for (int j = array.length - 1 - count; j > i; j--) {
                if (array[j] == array[i]) {
                    deleteElement(array, j);
                    count++;
                }
            }
        }
        return array;
    }

    private static void deleteElement(int[] array, int index) {
        System.arraycopy(array, index + 1, array, index, array.length - 1 - index);
        array[array.length - 1] = 0;
    }
}
