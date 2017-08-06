package com.A.training.B.C.sinitsynv;

import static com.A.training.B.C.sinitsynv.TaskCh04N033.isLastNumberEven;
import static com.A.training.B.C.sinitsynv.TaskCh04N033.isLastNumberOdd;
import static com.A.training.B.util.Assert.assertEquals;

public class TaskCh04N033Test {
    public static void main(String[] args) {
        testIsLastNumberEven();
        testIsLastNumberOdd();
    }

    public static void testIsLastNumberEven() {
        assertEquals("TaskCh04N033Test.testIsLastNumberEvenTest1", true, isLastNumberEven(18));
        assertEquals("TaskCh04N033Test.testIsLastNumberEvenTest2", false, isLastNumberEven(19));
    }

    public static void testIsLastNumberOdd() {
        assertEquals("TaskCh04N033Test.testIsLastNumberOddTest1", true, isLastNumberOdd(19));
        assertEquals("TaskCh04N033Test.testIsLastNumberOddTest2", false, isLastNumberOdd(18));
    }
}
