package com.A.training.B.C.sinitsynv;

import static com.A.training.B.C.sinitsynv.TaskCh10N044.getNumeralRoot;
import static com.A.training.B.util.Assert.assertEquals;

public class TaskCh10N044Test {
    public static void main(String[] args) {
        testGetNumeralRoot();
    }

    public static void testGetNumeralRoot() {
        assertEquals("TaskCh10N044Test.testGetNumeralRoot", 5, getNumeralRoot(329));
    }
}
