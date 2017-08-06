package com.A.training.B.C.sinitsynv;

import static com.A.training.B.C.sinitsynv.TaskCh10N043.getAmountOfNumerals;
import static com.A.training.B.C.sinitsynv.TaskCh10N043.getSumOfNumerals;
import static com.A.training.B.util.Assert.assertEquals;

public class TaskCh10N043Test {
    public static void main(String[] args) {
        testGetSumOfNumerals();
        testGetAmountOfNumerals();
    }

    public static void testGetSumOfNumerals() {
        assertEquals("TaskCh10N043Test.testGetSumOfNumerals", 12, getSumOfNumerals(246));
    }

    public static void testGetAmountOfNumerals() {
        assertEquals("TaskCh10N043Test.testGetAmountOfNumerals", 3, getAmountOfNumerals(246));
    }
}
