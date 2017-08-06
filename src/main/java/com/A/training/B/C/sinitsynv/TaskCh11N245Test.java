package com.A.training.B.C.sinitsynv;

import static com.A.training.B.C.sinitsynv.TaskCh11N245.replacePlacesNumbers;
import static com.A.training.B.util.Assert.assertEquals;

public class TaskCh11N245Test {
    public static void main(String[] args) {
        testReplacePlacesNumbers();
    }

    public static void testReplacePlacesNumbers() {
        int[] arrayIn = {1, 2, 3, 4, 5, 0, -5, -4, -3, -2, -1};
        int[] arrayOut = {-5, -4, -3, -2, -1, 0, 5, 4, 3, 2, 1};
        assertEquals("TaskCh11N245Test.testReplacePlacesNumbers", arrayOut, replacePlacesNumbers(arrayIn));
    }
}
