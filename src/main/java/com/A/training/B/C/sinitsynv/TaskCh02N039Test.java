package com.A.training.B.C.sinitsynv;

import static com.A.training.B.C.sinitsynv.TaskCh02N039.getTimeInDegree;
import static com.A.training.B.util.Assert.assertEquals;

public class TaskCh02N039Test {
    public static void main(String[] args) {
        testGetTimeInDegree();
    }

    public static void testGetTimeInDegree() {
        assertEquals("TaskCh02N039Test.testGetTimeInDegree", 180, getTimeInDegree(6, 0, 0));
    }
}
