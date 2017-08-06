package com.A.training.B.C.sinitsynv;

import static com.A.training.B.C.sinitsynv.TaskCh12N234.deleteColumn;
import static com.A.training.B.C.sinitsynv.TaskCh12N234.deleteRow;
import static com.A.training.B.util.Assert.assertEquals;


public class TaskCh12N234Test {
    public static void main(String[] args) {
        testDeleteRow();
        testDeleteColumn();
    }

    public static void testDeleteRow() {
        int[][] arrayIn = {
            {1, 2, 3, 6},
            {4, 5, 6, 7},
            {7, 8, 9, 9},
            {9, 5, 7, 2},
        };
        int[][] arrayOut = {
            {1, 2, 3, 6},
            {7, 8, 9, 9},
            {9, 5, 7, 2},
            {0, 0, 0, 0},
        };
        assertEquals("TaskCh12N234Test.testDeleteRow", arrayOut, deleteRow(arrayIn, 1));
    }

    public static void testDeleteColumn() {
        int[][] arrayIn = {
            {1, 2, 3, 6},
            {4, 5, 6, 7},
            {7, 8, 9, 9},
            {9, 5, 7, 2},
        };
        int[][] arrayOut = {
            {1, 3, 6, 0},
            {4, 6, 7, 0},
            {7, 9, 9, 0},
            {9, 7, 2, 0}
        };
        assertEquals("TaskCh12N234Test.testDeleteColumn", arrayOut, deleteColumn(arrayIn, 1));
    }
}
