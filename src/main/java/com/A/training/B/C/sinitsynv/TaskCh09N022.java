package com.A.training.B.C.sinitsynv;

import java.util.Scanner;

public class TaskCh09N022 {
    public static void main(String[] args) {
        System.out.println("Please input word:");
        Scanner scanner = new Scanner(System.in);
        String word = scanner.next();
        scanner.close();
        System.out.println(getHalfWord(word));
    }

    public static String getHalfWord(String word) {
        return word.substring(0, word.length() / 2);
    }
}

