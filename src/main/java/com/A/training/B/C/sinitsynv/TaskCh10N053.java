package com.A.training.B.C.sinitsynv;

import java.util.Arrays;
import java.util.Scanner;

public class TaskCh10N053 {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder();
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int a = scanner.nextInt();
            if (a == 0) {
                break;
            }
            str.append(a).append(' ');
        }
        scanner.close();
        String[] arrayStr = str.toString().split(" ");
        int[] arrayInt = new int[arrayStr.length];
        for (int i = 0; i < arrayInt.length; i++) {
            arrayInt[i] = Integer.valueOf(arrayStr[i]);
        }
        int first = 0;
        int last = arrayInt.length - 1;
        System.out.println(Arrays.toString(getReverseArray(arrayInt, first, last)));
    }

    public static int[] getReverseArray(int[] array, int first, int last) {
        if (first < last) {
            int temp = array[first];
            array[first] = array[last];
            array[last] = temp;
            getReverseArray(array, first + 1, last - 1);
        }
        return array;
    }
}
