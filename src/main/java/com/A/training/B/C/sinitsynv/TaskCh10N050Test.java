package com.A.training.B.C.sinitsynv;

import static com.A.training.B.C.sinitsynv.TaskCh10N050.getAkkermanNumber;
import static com.A.training.B.util.Assert.assertEquals;

public class TaskCh10N050Test {
    public static void main(String[] args) {
        testGetAkkermanNumber();
    }

    public static void testGetAkkermanNumber() {
        assertEquals("TaskCh10N050Test.testGetAkkermanNumber", 61, getAkkermanNumber(3, 3));
    }
}
