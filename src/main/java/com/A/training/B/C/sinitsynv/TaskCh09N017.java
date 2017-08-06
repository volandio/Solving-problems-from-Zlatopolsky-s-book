package com.A.training.B.C.sinitsynv;

import java.util.Scanner;

public class TaskCh09N017 {
    public static void main(String[] args) {
        System.out.println("Please input word:");
        Scanner scanner = new Scanner(System.in);
        String word = scanner.next();
        scanner.close();
        System.out.println(isFirstAndLastLetterEqual(word));
    }

    public static boolean isFirstAndLastLetterEqual(String word) {
        return word.toLowerCase().charAt(0) == word.toLowerCase().charAt(word.length() - 1);
    }
}
