package com.A.training.B.C.sinitsynv;

import static com.A.training.B.C.sinitsynv.TaskCh11N158.deleteSameElement;
import static com.A.training.B.util.Assert.assertEquals;

public class TaskCh11N158Test {
    public static void main(String[] args) {
        testDeleteSameElement();
    }

    public static void testDeleteSameElement() {
        int[] arrayIn = {5, 0, 9, 13, 13, 0, 13, 0, 9};
        int[] arrayOut = {5, 0, 9, 13, 0, 0, 0, 0, 0};
        assertEquals("TaskCh11N158Test.testDeleteSameElement", arrayOut, deleteSameElement(arrayIn));
    }
}
