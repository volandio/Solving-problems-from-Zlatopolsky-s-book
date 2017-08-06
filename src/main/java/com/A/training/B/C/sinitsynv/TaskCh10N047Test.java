package com.A.training.B.C.sinitsynv;

import static com.A.training.B.C.sinitsynv.TaskCh10N047.getFibonacci;
import static com.A.training.B.util.Assert.assertEquals;

public class TaskCh10N047Test {
    public static void main(String[] args) {
        testGetFibonacci();
    }

    public static void testGetFibonacci() {
        assertEquals("TaskCh10N047Test.testGetFibonacci", 3, getFibonacci(4));
    }
}
