package com.A.training.B.C.sinitsynv;

import static com.A.training.B.C.sinitsynv.TaskCh04N036.isColor;
import static com.A.training.B.util.Assert.assertEquals;

public class TaskCh04N036Test {
    public static void main(String[] args) {
        testIsColor();
    }

    public static void testIsColor() {
        assertEquals("TaskCh04N036Test.testIsColorTest1", "red", isColor(3));
        assertEquals("TaskCh04N036Test.testIsColorTest2", "green", isColor(5));
    }
}

