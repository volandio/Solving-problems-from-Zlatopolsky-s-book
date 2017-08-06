package com.A.training.B.C.sinitsynv;

import static com.A.training.B.C.sinitsynv.TaskCh05N010.getCourse;
import static com.A.training.B.util.Assert.assertEquals;

public class TaskCh05N010Test {
    public static void main(String[] args) {
        testGetCourse();
    }

    public static void testGetCourse() {
        double[] arrayIn = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20, 22, 24, 26, 28, 30, 32, 34, 36, 38, 40};
        assertEquals("TaskCh05N010Test.testGetCourse", arrayIn, getCourse(2));
    }
}
