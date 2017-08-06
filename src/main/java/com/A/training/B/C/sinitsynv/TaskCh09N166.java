package com.A.training.B.C.sinitsynv;

import java.util.Scanner;

public class TaskCh09N166 {
    public static void main(String[] args) {
        System.out.println("Please input sentence:");
        Scanner scanner = new Scanner(System.in);
        String sentence = scanner.next();
        scanner.close();
        System.out.println(getReplaceFirstLastWords(sentence));
    }

    public static String getReplaceFirstLastWords(String sentence) {
        String[] words = sentence.split(" ");
        String firstWord = words[0];
        String lastWord = words[words.length - 1];
        StringBuilder str = new StringBuilder();
        int lastWordLength = lastWord.length() - 1;
        str.append(lastWord.substring(0, 1).toUpperCase())
            .append(lastWord.substring(1, lastWordLength))
            .append(' ');
        for (int i = 1; i < words.length - 1; i++) {
            str.append(words[i])
                .append(' ');
        }
        str.append(firstWord.substring(0, 1).toLowerCase())
            .append(firstWord.substring(1))
            .append(lastWord.substring(lastWordLength));
        return str.toString();
    }
}
