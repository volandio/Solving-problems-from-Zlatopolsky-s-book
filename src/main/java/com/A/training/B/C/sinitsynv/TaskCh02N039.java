package com.A.training.B.C.sinitsynv;

import java.util.Scanner;

public class TaskCh02N039 {
    public static final int SECONDS_PER_MINUTE = 60;
    public static final int MINUTES_PER_HOUR = 60;
    public static final int SECONDS_PER_HOUR = SECONDS_PER_MINUTE * MINUTES_PER_HOUR;
    public static final int SECONDS_PER_12H = 12 * SECONDS_PER_HOUR;
    public static final int DEGREES_PER_CIRCLE = 360;
    public static final int SECONDS_PER_DEGREE = SECONDS_PER_12H / DEGREES_PER_CIRCLE;

    public static void main(String[] args) {
        System.out.println("Please input number hours time");
        Scanner scanner = new Scanner(System.in);
        int hours = scanner.nextInt();
        System.out.println("Please input number minutes time");
        int minutes = scanner.nextInt();
        System.out.println("Please input number seconds time");
        int seconds = scanner.nextInt();
        scanner.close();
        System.out.println(getTimeInDegree(hours, minutes, seconds));
    }

    public static int getTimeInDegree(int h, int m, int s) {
        if (h < 0 || h > 23 || m < 0 || m > 59 || s < 0 || s > 59) {
            System.out.println("You input incorrect time");
            return 0;
        }
        if (h >= 12) {
            h -= 12;
        }
        int secondsFromTwelveHours = h*SECONDS_PER_HOUR + m*SECONDS_PER_MINUTE + s;
        return secondsFromTwelveHours/SECONDS_PER_DEGREE;
    }
}
