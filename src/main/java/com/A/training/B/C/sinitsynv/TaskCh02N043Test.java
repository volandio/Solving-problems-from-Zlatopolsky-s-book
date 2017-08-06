package com.A.training.B.C.sinitsynv;

import static com.A.training.B.C.sinitsynv.TaskCh02N043.getNumberOneOrAny;
import static com.A.training.B.util.Assert.assertEquals;

public class TaskCh02N043Test {
    public static void main(String[] args) {
        testGetNumberOneOrAny();
    }

    public static void testGetNumberOneOrAny() {
        assertEquals("TaskCh02N043Test.testGetNumberOneOrAnyTest1", 501, getNumberOneOrAny(50, 60));
        assertEquals("TaskCh02N043Test.testGetNumberOneOrAnyTest2", 1, getNumberOneOrAny(6, 3));
    }
}
