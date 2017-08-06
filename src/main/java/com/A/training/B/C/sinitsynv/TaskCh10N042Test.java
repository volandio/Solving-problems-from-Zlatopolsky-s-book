package com.A.training.B.C.sinitsynv;

import static com.A.training.B.C.sinitsynv.TaskCh10N042.powOfNumber;
import static com.A.training.B.util.Assert.assertEquals;

public class TaskCh10N042Test {
    public static void main(String[] args) {
        testGetNumberInDegree();
    }

    public static void testGetNumberInDegree() {
        assertEquals("TaskCh10N042Test.testGetNumberInDegree", 8, powOfNumber(2.0, 3));
    }
}
