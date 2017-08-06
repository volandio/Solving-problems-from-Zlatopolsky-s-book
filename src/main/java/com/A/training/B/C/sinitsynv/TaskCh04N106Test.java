package com.A.training.B.C.sinitsynv;

import static com.A.training.B.C.sinitsynv.TaskCh04N106.getMonthByNumber;
import static com.A.training.B.util.Assert.assertEquals;

public class TaskCh04N106Test {
    public static void main(String[] args) {
        testGetMonthByNumber();
    }

    public static void testGetMonthByNumber() {
        assertEquals("TaskCh04N106Test.testGetMonthByNumberTest1", "summer", getMonthByNumber(6));
        assertEquals("TaskCh04N106Test.testGetMonthByNumberTest2", "winter", getMonthByNumber(1));
        assertEquals("TaskCh04N106Test.testGetMonthByNumberTest3", "autumn", getMonthByNumber(9));
        assertEquals("TaskCh04N106Test.testGetMonthByNumberTest4", "spring", getMonthByNumber(5));
    }
}

