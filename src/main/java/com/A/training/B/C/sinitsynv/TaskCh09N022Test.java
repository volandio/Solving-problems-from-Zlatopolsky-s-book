package com.A.training.B.C.sinitsynv;

import static com.A.training.B.C.sinitsynv.TaskCh09N022.getHalfWord;
import static com.A.training.B.util.Assert.assertEquals;

public class TaskCh09N022Test {
    public static void main(String[] args) {
        testGetHalfWord();
    }

    public static void testGetHalfWord() {
        assertEquals("TaskCh09N022Test.testGetHalfWord", "Go", getHalfWord("Good"));
    }
}
