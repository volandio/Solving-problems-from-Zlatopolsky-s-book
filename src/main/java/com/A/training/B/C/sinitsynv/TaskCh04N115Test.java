package com.A.training.B.C.sinitsynv;

import static com.A.training.B.C.sinitsynv.TaskCh04N115.getNameOfYear;
import static com.A.training.B.util.Assert.assertEquals;

public class TaskCh04N115Test {
    public static void main(String[] args) {
        testGetNameOfYear();
    }

    public static void testGetNameOfYear() {
        assertEquals("TaskCh04N115Test.testGetNameOfYearTest1", "Rooster, Red", getNameOfYear(2017));
        assertEquals("TaskCh04N115Test.testGetNameOfYearTest2", "Horse, White", getNameOfYear(1990));
    }
}