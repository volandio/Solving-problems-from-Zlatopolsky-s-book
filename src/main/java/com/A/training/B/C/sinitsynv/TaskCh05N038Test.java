package com.A.training.B.C.sinitsynv;

import static com.A.training.B.C.sinitsynv.TaskCh05N038.getAllDistance;
import static com.A.training.B.C.sinitsynv.TaskCh05N038.getDistanceFromHome;
import static com.A.training.B.util.Assert.assertEquals;

public class TaskCh05N038Test {
    public static void main(String[] args) {
        testGetDistanceFromHome();
        testGetAllDistance();
    }

    public static void testGetDistanceFromHome() {
        assertEquals("TaskCh05N038Test.testGetDistanceFromHome", 0.5, getDistanceFromHome(2));
    }

    public static void testGetAllDistance() {
        assertEquals("TaskCh05N038Test.testGetAllDistance", 1.5, getAllDistance(2));
    }
}
