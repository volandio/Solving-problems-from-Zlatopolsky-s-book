package com.A.training.B.C.sinitsynv;

import static com.A.training.B.C.sinitsynv.TaskCh09N185.isBracketsCorrectly;
import static com.A.training.B.util.Assert.assertEquals;

public class TaskCh09N185Test {
    public static void main(String[] args) {
        testIsBrackets();
    }

    public static void testIsBrackets() {
        assertEquals("TaskCh09N185Test.testIsBrackets", "No, \")\" first redundant = 7",
            isBracketsCorrectly("(65+98))"));
        assertEquals("TaskCh09N185Test.testIsBrackets", "Yes",
            isBracketsCorrectly("(65+98)"));
    }
}
