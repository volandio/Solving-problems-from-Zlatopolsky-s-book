package com.A.training.B.C.sinitsynv;

import static com.A.training.B.C.sinitsynv.TaskCh10N056.isSimpleNumber;
import static com.A.training.B.util.Assert.assertEquals;

public class TaskCh10N056Test {
    public static void main(String[] args) {
        testIsSimpleNumber();
    }

    public static void testIsSimpleNumber() {
        assertEquals("TaskCh10N056Test.testIsSimpleNumber", true, isSimpleNumber(67));
    }
}
