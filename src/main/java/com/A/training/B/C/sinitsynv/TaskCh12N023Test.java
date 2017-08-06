package com.A.training.B.C.sinitsynv;

import static com.A.training.B.C.sinitsynv.TaskCh12N023.*;
import static com.A.training.B.util.Assert.assertEquals;

public class TaskCh12N023Test {
    public static void main(String[] args) {
        testFillArrayA();
        testFillArrayB();
        testFillArrayC();
    }

    public static void testFillArrayA() {
        int[][] arrayOut = new int[][] {
            {1, 0, 0, 0, 0, 0, 1},
            {0, 1, 0, 0, 0, 1, 0},
            {0, 0, 1, 0, 1, 0, 0},
            {0, 0, 0, 1, 0, 0, 0},
            {0, 0, 1, 0, 1, 0, 0},
            {0, 1, 0, 0, 0, 1, 0},
            {1, 0, 0, 0, 0, 0, 1}
        };
        assertEquals("TaskCh12N023Test.testFillArrayA", arrayOut, fillArrayA(7));
    }

    public static void testFillArrayB() {
        int[][] arrayOut = new int[][] {
            {1, 0, 0, 1, 0, 0, 1},
            {0, 1, 0, 1, 0, 1, 0},
            {0, 0, 1, 1, 1, 0, 0},
            {1, 1, 1, 1, 1, 1, 1},
            {0, 0, 1, 1, 1, 0, 0},
            {0, 1, 0, 1, 0, 1, 0},
            {1, 0, 0, 1, 0, 0, 1}
        };
        assertEquals("TaskCh12N023Test.testFillArrayB", arrayOut, fillArrayB(7));
    }

    public static void testFillArrayC() {
        int[][] arrayOut = new int[][] {
            {1, 1, 1, 1, 1, 1, 1},
            {0, 1, 1, 1, 1, 1, 0},
            {0, 0, 1, 1, 1, 0, 0},
            {0, 0, 0, 1, 0, 0, 0},
            {0, 0, 1, 1, 1, 0, 0},
            {0, 1, 1, 1, 1, 1, 0},
            {1, 1, 1, 1, 1, 1, 1}
        };
        assertEquals("TaskCh12N023Test.testFillArrayC", arrayOut, fillArrayC(7));
    }
}
