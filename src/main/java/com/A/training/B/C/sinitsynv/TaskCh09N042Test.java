package com.A.training.B.C.sinitsynv;

import static com.A.training.B.C.sinitsynv.TaskCh09N042.getWordMirror;
import static com.A.training.B.util.Assert.assertEquals;

public class TaskCh09N042Test {
    public static void main(String[] args) {
        testGetWordMirror();
    }

    public static void testGetWordMirror() {
        assertEquals("TaskCh09N042Test.testGetWordMirror", "god", getWordMirror("dog"));
    }
}

