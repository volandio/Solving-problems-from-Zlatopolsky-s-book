package com.A.training.B.C.sinitsynv;

import static com.A.training.B.C.sinitsynv.TaskCh12N063.calculateAverageNumberStudents;
import static com.A.training.B.util.Assert.assertEquals;

public class TaskCh12N063Test {
    public static void main(String[] args) {
        testCalculateAverageNumberStudents();
    }

    public static void testCalculateAverageNumberStudents() {
        int[][] arrayIn = new int[][] {
            {30, 26, 28, 30},
            {30, 26, 28, 30},
            {30, 26, 28, 30},
            {30, 26, 28, 30},
            {30, 26, 28, 30},
            {10, 26, 28, 30},
            {30, 26, 28, 30},
            {30, 26, 28, 30},
            {30, 26, 28, 30},
            {30, 26, 28, 30},
            {30, 26, 28, 30},
        };
        int[] arrayOut = {28, 26, 28, 30};
        assertEquals("TaskCh12N063Test.testCalculateAverageNumberStudents", arrayOut,
            calculateAverageNumberStudents(arrayIn));
    }
}
