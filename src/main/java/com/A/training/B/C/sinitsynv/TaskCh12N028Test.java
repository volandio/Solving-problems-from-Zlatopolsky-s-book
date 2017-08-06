package com.A.training.B.C.sinitsynv;

import static com.A.training.B.C.sinitsynv.TaskCh12N028.fillArray;
import static com.A.training.B.util.Assert.assertEquals;

public class TaskCh12N028Test {
    public static void main(String[] args) {
        testFillArray();
    }

    public static void testFillArray() {
        int[][] arrayOut = new int[][] {
            {1, 2, 3, 4, 5},
            {16, 17, 18, 19, 6},
            {15, 24, 25, 20, 7},
            {14, 23, 22, 21, 8},
            {13, 12, 11, 10, 9}
        };
        assertEquals("TaskCh12N028Test.testFillArray", arrayOut, fillArray(5));
    }
}
