package com.A.training.B.C.sinitsynv;

import static com.A.training.B.C.sinitsynv.TaskCh09N015.getLetterFromWord;
import static com.A.training.B.util.Assert.assertEquals;

public class TaskCh09N015Test {
    public static void main(String[] args) {
        testGetLetterFromWord();
    }

    public static void testGetLetterFromWord() {
        assertEquals("TaskCh09N015Test.testGetLetterFromWord", 'd', getLetterFromWord("Good", 3));
    }
}
