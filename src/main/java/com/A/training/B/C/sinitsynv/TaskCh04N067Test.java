package com.A.training.B.C.sinitsynv;

import static com.A.training.B.C.sinitsynv.TaskCh04N067.isGetDay;
import static com.A.training.B.util.Assert.assertEquals;

public class TaskCh04N067Test {
    public static void main(String[] args) {
        testIsGetDay();
    }

    public static void testIsGetDay() {
        assertEquals("TaskCh04N067Test.testIsGetDay", "Workday", isGetDay(5));
    }
}
