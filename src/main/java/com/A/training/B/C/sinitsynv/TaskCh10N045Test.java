package com.A.training.B.C.sinitsynv;

import static com.A.training.B.C.sinitsynv.TaskCh10N045.getProgressionMember;
import static com.A.training.B.C.sinitsynv.TaskCh10N045.getSumFirstMembers;
import static com.A.training.B.util.Assert.assertEquals;

public class TaskCh10N045Test {
    public static void main(String[] args) {
        testGetProgressionMember();
        testGetSumFirstMembers();
    }

    public static void testGetProgressionMember() {
        assertEquals("TaskCh10N045Test.getProgressionMember.test1", 13, getProgressionMember(5, 4, 3));
    }

    public static void testGetSumFirstMembers() {
        assertEquals("TaskCh10N045Test.getSumFirstMembers.test1", 27, getSumFirstMembers(5, 4, 3));
    }
}
