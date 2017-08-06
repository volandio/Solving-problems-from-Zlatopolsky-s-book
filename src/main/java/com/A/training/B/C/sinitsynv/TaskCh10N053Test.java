package com.A.training.B.C.sinitsynv;

import static com.A.training.B.C.sinitsynv.TaskCh10N053.getReverseArray;
import static com.A.training.B.util.Assert.assertEquals;

public class TaskCh10N053Test {
    public static void main(String[] args) {
        testGetReverseArray();
    }

    public static void testGetReverseArray() {
        int[] arrayIn = {1, 2, 3, 4, 5};
        int[] arrayOut = {5, 4, 3, 2, 1};
        assertEquals("TaskCh10N053Test", arrayOut, getReverseArray(arrayIn, 0, 4));
    }
}
