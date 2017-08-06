package com.A.training.B.C.sinitsynv;

import static com.A.training.B.C.sinitsynv.TaskCh05N064.getPopulationDensity;
import static com.A.training.B.util.Assert.assertEquals;

public class TaskCh05N064Test {
    public static void main(String[] args) {
        testGetPopulationDensity();
    }

    public static void testGetPopulationDensity() {
        double[][] arrayIn = {
            {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12},
            {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12}
        };
        assertEquals("TaskCh05N064Test.testGetPopulationDensity", 1, getPopulationDensity(arrayIn));
    }
}
