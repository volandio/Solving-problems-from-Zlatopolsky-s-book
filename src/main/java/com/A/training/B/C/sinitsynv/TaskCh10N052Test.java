package com.A.training.B.C.sinitsynv;

import static com.A.training.B.C.sinitsynv.TaskCh10N052.getReverseNaturalNumber;
import static com.A.training.B.util.Assert.assertEquals;

public class TaskCh10N052Test {
    public static void main(String[] args) {
        testGetReverseNaturalNumber();
    }

    public static void testGetReverseNaturalNumber() {
        assertEquals("TaskCh10N052Test.testGetReverseNaturalNumber", 567, getReverseNaturalNumber(765));
    }
}
