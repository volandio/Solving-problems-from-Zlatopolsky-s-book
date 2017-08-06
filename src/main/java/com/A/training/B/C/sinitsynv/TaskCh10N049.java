package com.A.training.B.C.sinitsynv;

import java.util.Scanner;

public class TaskCh10N049 {
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
        int temp = size - 1;
        if (temp == 0) {
            return 0;
        }
        int index = findMax(array, temp);
        return array[temp] >= array[index] ? temp : index;
    }
}

