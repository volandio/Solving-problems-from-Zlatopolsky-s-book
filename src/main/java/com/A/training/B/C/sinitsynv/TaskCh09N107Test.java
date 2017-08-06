package com.A.training.B.C.sinitsynv;

import static com.A.training.B.C.sinitsynv.TaskCh09N107.getWordReverseLetter;
import static com.A.training.B.util.Assert.assertEquals;

public class TaskCh09N107Test {
    public static void main(String[] args) {
        testGetWordReverseLetter();
    }

    public static void testGetWordReverseLetter() {
        assertEquals("TaskCh09N107Test.testGetWordReverseLetter", "obaut", getWordReverseLetter("about"));
        assertEquals("TaskCh09N107Test.testGetWordReverseLetter",
            "Word isn't have letters \"a\" and \"o\" together", getWordReverseLetter("Shop"));
    }
}
