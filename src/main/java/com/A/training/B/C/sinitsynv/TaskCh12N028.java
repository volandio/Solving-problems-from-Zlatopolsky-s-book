package com.A.training.B.C.sinitsynv;

import java.util.Arrays;
import java.util.Scanner;

public class TaskCh12N028 {
    public static void main(String[] args) {
        System.out.println("Please input array size");
        Scanner scanner = new Scanner(System.in);
        int arraySize = scanner.nextInt();
        scanner.close();
        for (int[] i : fillArray(arraySize)) {
            System.out.println(Arrays.toString(i));
        }
    }

    public static int[][] fillArray(int sizeArray) {
        int[][] array = new int[sizeArray][sizeArray];
        if (sizeArray % 2 != 1) {
            return array;
        }
        int a = sizeArray - 1;
        int b = sizeArray - 1;
        int count = 1;
        int i = 0;
        int j = 0;
        int p = 0;
        while (count != sizeArray * sizeArray) {
            while (j < b) {
                array[i][j] = count++;
                j++;
            }
            while (i < a) {
                array[i][j] = count++;
                i++;
            }
            while (j > p) {
                array[i][j] = count++;
                j--;
            }
            a--;
            b--;
            p++;
            while (i > p) {
                array[i][j] = count++;
                i--;
            }
        }
        if (count == sizeArray * sizeArray) {
            array[i][j] = count;
        }
        return array;
    }
}
