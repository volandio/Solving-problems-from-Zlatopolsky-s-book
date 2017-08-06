package com.A.training.B.C.sinitsynv;

import java.util.Arrays;
import java.util.Scanner;

public class TaskCh11N245 {
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
        System.out.println(Arrays.toString(replacePlacesNumbers(array)));
    }

    public static int[] replacePlacesNumbers(int[] array) {
        int[] newArray = new int[array.length];
        for (int countUp = 0, countDown = array.length - 1, i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                newArray[countUp] = array[i];
                countUp++;
            } else {
                newArray[countDown] = array[i];
                countDown--;
            }
        }
        return newArray;
    }
}