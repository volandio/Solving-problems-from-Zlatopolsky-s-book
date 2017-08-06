package com.A.training.B.C.sinitsynv;

import java.util.Scanner;

public class TaskCh04N115 {
    public static void main(String[] args) {
        System.out.println("Please input year >= 1984");
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();
        scanner.close();
        System.out.println(getNameOfYear(year));
    }

    public static String getNameOfYear(int x) {
        if (x < 1984) {
            System.out.println("You input incorrect year");
            return "Incorrect year";
        }
        int ofYearAnimal = (x - 1984) % 12;
        int ofYearColor = (x - 1984) % 10;
        String animalAndColorOfYear = "";
        switch (ofYearAnimal) {
            case 0:
                animalAndColorOfYear = "Rat, ";
                break;
            case 1:
                animalAndColorOfYear = "Cow, ";
                break;
            case 2:
                animalAndColorOfYear = "Tiger, ";
                break;
            case 3:
                animalAndColorOfYear = "Hare, ";
                break;
            case 4:
                animalAndColorOfYear = "Dragon, ";
                break;
            case 5:
                animalAndColorOfYear = "Snake, ";
                break;
            case 6:
                animalAndColorOfYear = "Horse, ";
                break;
            case 7:
                animalAndColorOfYear = "Sheep, ";
                break;
            case 8:
                animalAndColorOfYear = "Monkey, ";
                break;
            case 9:
                animalAndColorOfYear = "Rooster, ";
                break;
            case 10:
                animalAndColorOfYear = "Dog, ";
                break;
            case 11:
                animalAndColorOfYear = "Pig, ";
                break;
        }
        switch (ofYearColor) {
            case 0:
            case 1:
                animalAndColorOfYear += "Green";
                break;
            case 2:
            case 3:
                animalAndColorOfYear += "Red";
                break;
            case 4:
            case 5:
                animalAndColorOfYear += "Yellow";
                break;
            case 6:
            case 7:
                animalAndColorOfYear += "White";
                break;
            case 8:
            case 9:
                animalAndColorOfYear += "Black";
                break;
        }
        return animalAndColorOfYear;
    }
}
