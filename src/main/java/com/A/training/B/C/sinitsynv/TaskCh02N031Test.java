package com.A.training.B.C.sinitsynv;

import static com.A.training.B.C.sinitsynv.TaskCh02N031.getEditNumber;
import static com.A.training.B.util.Assert.assertEquals;

public class TaskCh02N031Test {
    public static void main(String[] args) {
        testGetEditNumber();
    }

    public static void testGetEditNumber() {
        assertEquals("TaskCh02N031Test.testGetEditNumber", 100, getEditNumber(100));
    }
}
