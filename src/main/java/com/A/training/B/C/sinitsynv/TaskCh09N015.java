package com.A.training.B.C.sinitsynv;

import java.util.Scanner;

public class TaskCh09N015 {
    public static void main(String[] args) {
        System.out.println("Please input word:");
        Scanner scanner = new Scanner(System.in);
        String word = scanner.next();
        System.out.println("Please input number symbol for print it:");
        int k = scanner.nextInt();
        scanner.close();
        System.out.println(getLetterFromWord(word, k));
    }

    public static char getLetterFromWord(String word, int k) {
        return word.charAt(k);
    }
}
