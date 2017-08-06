package com.A.training.B.C.sinitsynv;

import java.util.Scanner;

public class TaskCh09N042 {
    public static void main(String[] args) {
        System.out.println("Please input word:");
        Scanner scanner = new Scanner(System.in);
        String word = scanner.next();
        scanner.close();
        System.out.println(getWordMirror(word));
    }

    public static String getWordMirror(String word) {
        StringBuilder newWord = new StringBuilder(word);
        return newWord.reverse().toString();
    }
}
