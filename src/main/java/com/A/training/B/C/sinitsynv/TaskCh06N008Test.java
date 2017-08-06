package com.A.training.B.C.sinitsynv;

import static com.A.training.B.C.sinitsynv.TaskCh06N008.getListNumbersSquare;
import static com.A.training.B.util.Assert.assertEquals;

public class TaskCh06N008Test {
    public static void main(String[] args) {
        testGetListNumbersSquare();
    }

    public static void testGetListNumbersSquare() {
        int[] arrayIn = {1, 4, 9, 16, 25};
        assertEquals("TaskCh06N008Test.testGetListNumbersSquare", arrayIn, getListNumbersSquare(35));
    }
}
