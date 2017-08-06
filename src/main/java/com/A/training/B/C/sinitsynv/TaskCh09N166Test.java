package com.A.training.B.C.sinitsynv;

import static com.A.training.B.C.sinitsynv.TaskCh09N166.getReplaceFirstLastWords;
import static com.A.training.B.util.Assert.assertEquals;

public class TaskCh09N166Test {
    public static void main(String[] args) {
        testGetReplaceFirstLastWords();
    }

    public static void testGetReplaceFirstLastWords() {
        assertEquals("TaskCh09N166Test.testGetReplaceFirstLastWords", "Day is very good it!",
            getReplaceFirstLastWords("It is very good day!"));
    }
}
