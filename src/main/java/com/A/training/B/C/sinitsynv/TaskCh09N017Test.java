package com.A.training.B.C.sinitsynv;

import static com.A.training.B.C.sinitsynv.TaskCh09N017.isFirstAndLastLetterEqual;
import static com.A.training.B.util.Assert.assertEquals;

public class TaskCh09N017Test {
    public static void main(String[] args) {
        testIsFirstAndLastLetterEqual();
    }

    public static void testIsFirstAndLastLetterEqual() {
        assertEquals("TaskCh09N017Test.testIsFirstAndLastLetterEqualTest1", true, isFirstAndLastLetterEqual("Asia"));
        assertEquals("TaskCh09N017Test.testIsFirstAndLastLetterEqualTest2", false, isFirstAndLastLetterEqual("Shop"));
    }
}
