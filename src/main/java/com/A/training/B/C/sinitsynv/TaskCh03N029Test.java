package com.A.training.B.C.sinitsynv;

import static com.A.training.B.C.sinitsynv.TaskCh03N029.*;
import static com.A.training.B.util.Assert.assertEquals;

public class TaskCh03N029Test {
    public static void main(String[] args) {
        testIsOddTwoNumbers();
        testIsOneOfTwoNumbersLessTwenty();
        testIsOneOrTwoOfTwoNumbersEqualZero();
        testIsThreeNumbersNegative();
        testIsOnlyOneOfThreeNumbersMultipleFive();
        testIsOneOrMoreOfThreeNumbersMoreHundred();
    }

    public static void testIsOddTwoNumbers() {
        assertEquals("TaskCh03N029Test.testIsOddTwoNumbersTest1", true, isOddTwoNumbers(5, 3));
        assertEquals("TaskCh03N029Test.testIsOddTwoNumbersTest2", false, isOddTwoNumbers(5, 4));
        assertEquals("TaskCh03N029Test.testIsOddTwoNumbersTest3", false, isOddTwoNumbers(4, 5));
        assertEquals("TaskCh03N029Test.testIsOddTwoNumbersTest4", false, isOddTwoNumbers(4, 6));
    }

    public static void testIsOneOfTwoNumbersLessTwenty() {
        assertEquals("TaskCh03N029Test.testIsOneOfTwoNumbersLessTwentyTest1", true, isOneOfTwoNumbersLessTwenty(25, 3));
        assertEquals("TaskCh03N029Test.testIsOneOfTwoNumbersLessTwentyTest2", true, isOneOfTwoNumbersLessTwenty(3, 25));
        assertEquals("TaskCh03N029Test.testIsOneOfTwoNumbersLessTwentyTest3", false,
            isOneOfTwoNumbersLessTwenty(21, 22));
        assertEquals("TaskCh03N029Test.testIsOneOfTwoNumbersLessTwentyTest4", false,
            isOneOfTwoNumbersLessTwenty(19, 3));
    }

    public static void testIsOneOrTwoOfTwoNumbersEqualZero() {
        assertEquals("TaskCh03N029Test.testIsOneOrTwoOfTwoNumbersEqualZeroTest1", true,
            isOneOrTwoOfTwoNumbersEqualZero(0, 3));
        assertEquals("TaskCh03N029Test.testIsOneOrTwoOfTwoNumbersEqualZeroTest2", true,
            isOneOrTwoOfTwoNumbersEqualZero(5, 0));
        assertEquals("TaskCh03N029Test.testIsOneOrTwoOfTwoNumbersEqualZeroTest3", false,
            isOneOrTwoOfTwoNumbersEqualZero(5, 3));
        assertEquals("TaskCh03N029Test.testIsOneOrTwoOfTwoNumbersEqualZeroTest4", true,
            isOneOrTwoOfTwoNumbersEqualZero(0, 0));
    }

    public static void testIsThreeNumbersNegative() {
        assertEquals("TaskCh03N029Test.testIsThreeNumbersNegativeTest1", true,
            isThreeNumbersNegative(-2, -3, -1));
        assertEquals("TaskCh03N029Test.testIsThreeNumbersNegativeTest2", false,
            isThreeNumbersNegative(-2, 2, -1));
        assertEquals("TaskCh03N029Test.testIsThreeNumbersNegativeTest3", false,
            isThreeNumbersNegative(-2, -2, 1));
        assertEquals("TaskCh03N029Test.testIsThreeNumbersNegativeTest4", false,
            isThreeNumbersNegative(1, -2, -1));
        assertEquals("TaskCh03N029Test.testIsThreeNumbersNegativeTest5", false,
            isThreeNumbersNegative(1, 1, 1));
        assertEquals("TaskCh03N029Test.testIsThreeNumbersNegativeTest6", false,
            isThreeNumbersNegative(1, 2, -1));
        assertEquals("TaskCh03N029Test.testIsThreeNumbersNegativeTest7", false,
            isThreeNumbersNegative(1, -2, 1));
        assertEquals("TaskCh03N029Test.testIsThreeNumbersNegativeTest8", false,
            isThreeNumbersNegative(-2, 2, 1));
    }

    public static void testIsOnlyOneOfThreeNumbersMultipleFive() {
        assertEquals("TaskCh03N029Test.testIsOnlyOneOfThreeNumbersMultipleFiveTest1", true,
            isOnlyOneOfThreeNumbersMultipleFive(5, 2, 3));
        assertEquals("TaskCh03N029Test.testIsOnlyOneOfThreeNumbersMultipleFiveTest2", false,
            isOnlyOneOfThreeNumbersMultipleFive(5, 3, 5));
        assertEquals("TaskCh03N029Test.testIsOnlyOneOfThreeNumbersMultipleFiveTest3", false,
            isOnlyOneOfThreeNumbersMultipleFive(5, 5, 3));
        assertEquals("TaskCh03N029Test.testIsOnlyOneOfThreeNumbersMultipleFiveTest4", false,
            isOnlyOneOfThreeNumbersMultipleFive(5, 5, 5));
        assertEquals("TaskCh03N029Test.testIsOnlyOneOfThreeNumbersMultipleFiveTest5", false,
            isOnlyOneOfThreeNumbersMultipleFive(3, 5, 5));
        assertEquals("TaskCh03N029Test.testIsOnlyOneOfThreeNumbersMultipleFiveTest6", true,
            isOnlyOneOfThreeNumbersMultipleFive(3, 3, 5));
        assertEquals("TaskCh03N029Test.testIsOnlyOneOfThreeNumbersMultipleFiveTest7", true,
            isOnlyOneOfThreeNumbersMultipleFive(3, 5, 3));
        assertEquals("TaskCh03N029Test.testIsOnlyOneOfThreeNumbersMultipleFiveTest8", false,
            isOnlyOneOfThreeNumbersMultipleFive(3, 3, 3));
    }

    public static void testIsOneOrMoreOfThreeNumbersMoreHundred() {
        assertEquals("TaskCh03N029Test.testIsOneOrMoreOfThreeNumbersMoreHundredTest1", true,
            isOneOrMoreOfThreeNumbersMoreHundred(101, 3, 5));
        assertEquals("TaskCh03N029Test.testIsOneOrMoreOfThreeNumbersMoreHundredTest2", true,
            isOneOrMoreOfThreeNumbersMoreHundred(101, 102, 103));
        assertEquals("TaskCh03N029Test.testIsOneOrMoreOfThreeNumbersMoreHundredTest3", true,
            isOneOrMoreOfThreeNumbersMoreHundred(101, 102, 5));
        assertEquals("TaskCh03N029Test.testIsOneOrMoreOfThreeNumbersMoreHundredTest4", true,
            isOneOrMoreOfThreeNumbersMoreHundred(101, 5, 102));
        assertEquals("TaskCh03N029Test.testIsOneOrMoreOfThreeNumbersMoreHundredTest5", true,
            isOneOrMoreOfThreeNumbersMoreHundred(4, 101, 99));
        assertEquals("TaskCh03N029Test.testIsOneOrMoreOfThreeNumbersMoreHundredTest6", true,
            isOneOrMoreOfThreeNumbersMoreHundred(4, 101, 102));
        assertEquals("TaskCh03N029Test.testIsOneOrMoreOfThreeNumbersMoreHundredTest7", true,
            isOneOrMoreOfThreeNumbersMoreHundred(4, 5, 101));
        assertEquals("TaskCh03N029Test.testIsOneOrMoreOfThreeNumbersMoreHundredTest8", false,
            isOneOrMoreOfThreeNumbersMoreHundred(4, 5, 6));
    }
}
