package com.A.training.B.C.sinitsynv;

import java.util.Scanner;

public class TaskCh09N107 {
    public static void main(String[] args) {
        System.out.println("Please input word:");
        Scanner scanner = new Scanner(System.in);
        String word = scanner.next();
        scanner.close();
        System.out.println(getWordReverseLetter(word));
    }

    public static String getWordReverseLetter(String word) {
        int firstA = word.indexOf("a");
        int lastO = word.lastIndexOf("o");
        if (firstA >= 0 && lastO >= 0) {
            StringBuilder builder = new StringBuilder(word);
            builder.replace(firstA, firstA+1, "o");
            builder.replace(lastO, lastO+1, "a");
            return builder.toString();
        }
        String error = "Word isn't have letters \"a\" and \"o\" together";
        System.out.println(error);
        return error;
    }
}
