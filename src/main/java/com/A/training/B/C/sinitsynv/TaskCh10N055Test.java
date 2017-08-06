package com.A.training.B.C.sinitsynv;

import static com.A.training.B.C.sinitsynv.TaskCh10N055.changeNumeration;
import static com.A.training.B.util.Assert.assertEquals;

public class TaskCh10N055Test {
    public static void main(String[] args) {
        testChangeNumeration();
    }

    public static void testChangeNumeration() {
        assertEquals("TaskCh10N055Test.testChangeNumeration", "9FDC5", changeNumeration(654789, 16));
    }
}
