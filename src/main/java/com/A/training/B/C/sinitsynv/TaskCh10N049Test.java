package com.A.training.B.C.sinitsynv;

import static com.A.training.B.C.sinitsynv.TaskCh10N049.findMax;
import static com.A.training.B.util.Assert.assertEquals;

public class TaskCh10N049Test {
    public static void main(String[] args) {
        testFindMax();
    }

    public static void testFindMax() {
        int[] arrayIn = {5, 20, 30, 10};
        assertEquals("TaskCh10N049Test.testFindMax", 2, findMax(arrayIn, 4));
    }
}
