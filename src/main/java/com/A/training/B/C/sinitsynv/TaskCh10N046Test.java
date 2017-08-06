package com.A.training.B.C.sinitsynv;

import static com.A.training.B.C.sinitsynv.TaskCh10N046.getProgressionMember;
import static com.A.training.B.C.sinitsynv.TaskCh10N046.getSumFirstMembers;
import static com.A.training.B.util.Assert.assertEquals;

public class TaskCh10N046Test {
    public static void main(String[] args) {
        testGetProgressionMember();
        testGetSumFirstMembers();
    }

    public static void testGetProgressionMember() {
        assertEquals("TaskCh10N046Test.getProgressionMember.testGetProgressionMember", 18,
            getProgressionMember(2, 3, 3));
    }

    public static void testGetSumFirstMembers() {
        assertEquals("TaskCh10N046Test.getSumFirstMembers.testGetSumFirstMembers", 26, getSumFirstMembers(2, 3, 3));
    }
}
