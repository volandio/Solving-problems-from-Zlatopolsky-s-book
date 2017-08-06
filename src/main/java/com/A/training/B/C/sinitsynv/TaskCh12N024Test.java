package com.A.training.B.C.sinitsynv;

import static com.A.training.B.C.sinitsynv.TaskCh12N024.fillArrayA;
import static com.A.training.B.C.sinitsynv.TaskCh12N024.fillArrayB;
import static com.A.training.B.util.Assert.assertEquals;

public class TaskCh12N024Test {
    public static void main(String[] args) {
        testFillArrayA();
        testFillArrayB();
    }

    public static void testFillArrayA() {
        int[][] arrayOut = new int[][] {
            {1, 1, 1, 1, 1, 1},
            {1, 2, 3, 4, 5, 6},
            {1, 3, 6, 10, 15, 21},
            {1, 4, 10, 20, 35, 56},
            {1, 5, 15, 35, 70, 126},
            {1, 6, 21, 56, 126, 252}
        };
        assertEquals("TaskCh12N024Test.testFillArrayA", arrayOut, fillArrayA(6));
    }

    public static void testFillArrayB() {
        int[][] arrayOut = new int[][] {
            {1, 2, 3, 4, 5, 6},
            {2, 3, 4, 5, 6, 1},
            {3, 4, 5, 6, 1, 2},
            {4, 5, 6, 1, 2, 3},
            {5, 6, 1, 2, 3, 4},
            {6, 1, 2, 3, 4, 5},
        };
        assertEquals("TaskCh12N024Test.testFillArrayB", arrayOut, fillArrayB(6));
    }
}
