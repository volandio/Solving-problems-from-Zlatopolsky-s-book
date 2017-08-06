package com.A.training.B.C.sinitsynv;

import static com.A.training.B.util.Assert.assertEquals;

public class TaskCh13N012Test {
    public static void main(String[] args) {
        testFindByMatchStrWithName();
        testFindByWorkedThanShouldMinYears();
    }

    private static void testFindByMatchStrWithName() {
        Database dataBase = new Database();
        assertEquals("TaskCh13N012Test.testFindByMatchStrWithName",
            dataBase.getEmployees().get(19).toString(), dataBase.findByMatchStrWithName("Dartveider").get(0).toString());
    }

    private static void testFindByWorkedThanShouldMinYears() {
        Database dataBase = new Database();
        assertEquals("TaskCh13N012Test.testFindByWorkThanShouldMinYears", dataBase.getEmployees().get(3).toString(),
            dataBase.findByWorkThanShouldMinYears(8).get(0).toString());
    }
}
