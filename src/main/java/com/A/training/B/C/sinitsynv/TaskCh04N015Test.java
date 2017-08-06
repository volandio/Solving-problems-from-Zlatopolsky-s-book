package com.A.training.B.C.sinitsynv;

import static com.A.training.B.C.sinitsynv.TaskCh04N015.getAge;
import static com.A.training.B.util.Assert.assertEquals;

public class TaskCh04N015Test {
    public static void main(String[] args) {
        testGetAge();
    }

    public static void testGetAge() {
        assertEquals("TaskCh04N015Test.testGetAge", 29, getAge(1985, 6, 2014, 12));
    }
}
