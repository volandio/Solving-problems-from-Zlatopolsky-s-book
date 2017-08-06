package com.A.training.B.C.sinitsynv;

import static com.A.training.B.C.sinitsynv.TaskCh02N013.getReverseNumber;
import static com.A.training.B.util.Assert.assertEquals;

public class TaskCh02N013Test {
    public static void main(String[] args) {
        testGetReverseNumber();
    }

    public static void testGetReverseNumber() {
        assertEquals("TaskCh02N013Test.testGetReverseNumber", 51, getReverseNumber(150));
    }
}
