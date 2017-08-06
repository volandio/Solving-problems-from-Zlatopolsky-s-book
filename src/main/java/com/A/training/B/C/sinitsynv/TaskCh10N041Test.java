package com.A.training.B.C.sinitsynv;

import static com.A.training.B.C.sinitsynv.TaskCh10N041.getFactorial;
import static com.A.training.B.util.Assert.assertEquals;

public class TaskCh10N041Test {
    public static void main(String[] args) {
        testGetFactorial();
    }

    public static void testGetFactorial() {
        assertEquals("TaskCh10N041Test.testGetFactorial", 24, getFactorial(4));
    }
}
