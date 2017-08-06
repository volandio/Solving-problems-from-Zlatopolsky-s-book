package com.A.training.B.C.sinitsynv;

import static com.A.training.B.C.sinitsynv.TaskCh10N048.findMax;
import static com.A.training.B.util.Assert.assertEquals;

public class TaskCh10N048Test {
    public static void main(String[] args) {
        testFindMax();
    }

    public static void testFindMax() {
        int[] arrayIn = {46, 21, 45, 19, 39};
        assertEquals("TaskCh10N048Test.testFindMax", 46, findMax(arrayIn, 5));
    }
}
